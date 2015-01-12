/**
 * Copyright (c) 2015 Niksa Visic.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.nv.dsl.generator;

import com.google.common.base.Objects;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.nv.dsl.mMDSL.AccessType;
import org.xtext.nv.dsl.mMDSL.Algorithm;
import org.xtext.nv.dsl.mMDSL.AlgorithmOperation;
import org.xtext.nv.dsl.mMDSL.Attribute;
import org.xtext.nv.dsl.mMDSL.AttributeGet;
import org.xtext.nv.dsl.mMDSL.AttributeOperation;
import org.xtext.nv.dsl.mMDSL.AttributeSet;
import org.xtext.nv.dsl.mMDSL.ButtonType;
import org.xtext.nv.dsl.mMDSL.Circle;
import org.xtext.nv.dsl.mMDSL.ClassAttribute;
import org.xtext.nv.dsl.mMDSL.ClassInstanceCreate;
import org.xtext.nv.dsl.mMDSL.ClassInstanceDelete;
import org.xtext.nv.dsl.mMDSL.ClassInstanceGet;
import org.xtext.nv.dsl.mMDSL.ClassInstanceGetAll;
import org.xtext.nv.dsl.mMDSL.ClassInstanceSet;
import org.xtext.nv.dsl.mMDSL.Color;
import org.xtext.nv.dsl.mMDSL.ContextItem;
import org.xtext.nv.dsl.mMDSL.DirCreate;
import org.xtext.nv.dsl.mMDSL.DirDelete;
import org.xtext.nv.dsl.mMDSL.DirGetWorking;
import org.xtext.nv.dsl.mMDSL.DirList;
import org.xtext.nv.dsl.mMDSL.DirOperation;
import org.xtext.nv.dsl.mMDSL.DirSetWorking;
import org.xtext.nv.dsl.mMDSL.EditBox;
import org.xtext.nv.dsl.mMDSL.Ellipse;
import org.xtext.nv.dsl.mMDSL.EmbedCode;
import org.xtext.nv.dsl.mMDSL.EnumType;
import org.xtext.nv.dsl.mMDSL.Enumeration;
import org.xtext.nv.dsl.mMDSL.ErrorBox;
import org.xtext.nv.dsl.mMDSL.FileCopy;
import org.xtext.nv.dsl.mMDSL.FileCreate;
import org.xtext.nv.dsl.mMDSL.FileDelete;
import org.xtext.nv.dsl.mMDSL.FileOperation;
import org.xtext.nv.dsl.mMDSL.FileRead;
import org.xtext.nv.dsl.mMDSL.FileWrite;
import org.xtext.nv.dsl.mMDSL.FillColor;
import org.xtext.nv.dsl.mMDSL.ForLoop;
import org.xtext.nv.dsl.mMDSL.InfoBox;
import org.xtext.nv.dsl.mMDSL.InsertContextItem;
import org.xtext.nv.dsl.mMDSL.InsertEmbedCode;
import org.xtext.nv.dsl.mMDSL.InsertMenuItem;
import org.xtext.nv.dsl.mMDSL.InstanceOperation;
import org.xtext.nv.dsl.mMDSL.ItemOperation;
import org.xtext.nv.dsl.mMDSL.Line;
import org.xtext.nv.dsl.mMDSL.LoopStatement;
import org.xtext.nv.dsl.mMDSL.MenuItem;
import org.xtext.nv.dsl.mMDSL.Metamodel;
import org.xtext.nv.dsl.mMDSL.Method;
import org.xtext.nv.dsl.mMDSL.MethodName;
import org.xtext.nv.dsl.mMDSL.Mode;
import org.xtext.nv.dsl.mMDSL.ModelCreate;
import org.xtext.nv.dsl.mMDSL.ModelDelete;
import org.xtext.nv.dsl.mMDSL.ModelDiscard;
import org.xtext.nv.dsl.mMDSL.ModelIsLoaded;
import org.xtext.nv.dsl.mMDSL.ModelLoad;
import org.xtext.nv.dsl.mMDSL.ModelOperation;
import org.xtext.nv.dsl.mMDSL.ModelSave;
import org.xtext.nv.dsl.mMDSL.ModelType;
import org.xtext.nv.dsl.mMDSL.Path;
import org.xtext.nv.dsl.mMDSL.Points;
import org.xtext.nv.dsl.mMDSL.Polygon;
import org.xtext.nv.dsl.mMDSL.Polyline;
import org.xtext.nv.dsl.mMDSL.Rectangle;
import org.xtext.nv.dsl.mMDSL.RefName;
import org.xtext.nv.dsl.mMDSL.Reference;
import org.xtext.nv.dsl.mMDSL.Relation;
import org.xtext.nv.dsl.mMDSL.RelationInstanceCreate;
import org.xtext.nv.dsl.mMDSL.RelationInstanceDelete;
import org.xtext.nv.dsl.mMDSL.RelationInstanceGet;
import org.xtext.nv.dsl.mMDSL.RelationInstanceGetAll;
import org.xtext.nv.dsl.mMDSL.RelationInstanceSet;
import org.xtext.nv.dsl.mMDSL.RemoveMenuItem;
import org.xtext.nv.dsl.mMDSL.Root;
import org.xtext.nv.dsl.mMDSL.SVGCommand;
import org.xtext.nv.dsl.mMDSL.SelectionStatement;
import org.xtext.nv.dsl.mMDSL.SimpleType;
import org.xtext.nv.dsl.mMDSL.SimpleUI;
import org.xtext.nv.dsl.mMDSL.Statement;
import org.xtext.nv.dsl.mMDSL.StrokeColor;
import org.xtext.nv.dsl.mMDSL.SymbolClass;
import org.xtext.nv.dsl.mMDSL.SymbolRelation;
import org.xtext.nv.dsl.mMDSL.SymbolStyle;
import org.xtext.nv.dsl.mMDSL.Text;
import org.xtext.nv.dsl.mMDSL.Type;
import org.xtext.nv.dsl.mMDSL.Variable;
import org.xtext.nv.dsl.mMDSL.ViewBox;
import org.xtext.nv.dsl.mMDSL.WarningBox;
import org.xtext.nv.dsl.mMDSL.WhileLoop;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class MMDSLGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String _className = this.className(resource);
    String _plus = (_className + "_output.all");
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    CharSequence _aLLcode = this.toALLcode(((Root) _head));
    fsa.generateFile(_plus, _aLLcode);
  }
  
  public String className(final Resource res) {
    URI _uRI = res.getURI();
    String name = _uRI.lastSegment();
    int _indexOf = name.indexOf(".");
    return name.substring(0, _indexOf);
  }
  
  public CharSequence toEnumValuesCode(final EList<String> enumvalues) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final String v : enumvalues) {
        {
          int _lastIndexOf = enumvalues.lastIndexOf(v);
          int _size = enumvalues.size();
          int _minus = (_size - 1);
          boolean _equals = (_lastIndexOf == _minus);
          if (_equals) {
            _builder.append(v, "");
          } else {
            _builder.append(v, "");
            _builder.append("@");
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence toTypeInt() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("TYPE INTEGER");
    _builder.newLine();
    _builder.append("VALUE 0");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <MultiLineString>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE 0");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <AttributeHelpText>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <AttributeRegularExpression>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <AttributeNumericDomain>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toTypeDouble() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("TYPE DOUBLE");
    _builder.newLine();
    _builder.append("VALUE 0");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <MultiLineString>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE 0");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <AttributeHelpText>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <AttributeRegularExpression>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <AttributeNumericDomain>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toTypeString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("TYPE STRING");
    _builder.newLine();
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <MultiLineString>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE 0");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <AttributeHelpText>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <AttributeRegularExpression>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toTypeEnum(final ClassAttribute ca) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("TYPE ENUMERATION");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <EnumerationDomain>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"");
    Type _type = ca.getType();
    EnumType _enumtype = _type.getEnumtype();
    Enumeration _name = _enumtype.getName();
    EList<String> _enumvalues = _name.getEnumvalues();
    CharSequence _enumValuesCode = this.toEnumValuesCode(_enumvalues);
    _builder.append(_enumValuesCode, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <MultiLineString>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE 0");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <AttributeHelpText>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <AttributeRegularExpression>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("CLASSATTRIBUTE <");
    String _name_1 = ca.getName();
    _builder.append(_name_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("VALUE \"");
    Type _type_1 = ca.getType();
    EnumType _enumtype_1 = _type_1.getEnumtype();
    Enumeration _name_2 = _enumtype_1.getName();
    EList<String> _enumvalues_1 = _name_2.getEnumvalues();
    String _get = _enumvalues_1.get(0);
    _builder.append(_get, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toTypeEnum(final Attribute a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("TYPE ENUMERATION");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <EnumerationDomain>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"");
    Type _type = a.getType();
    EnumType _enumtype = _type.getEnumtype();
    Enumeration _name = _enumtype.getName();
    EList<String> _enumvalues = _name.getEnumvalues();
    CharSequence _enumValuesCode = this.toEnumValuesCode(_enumvalues);
    _builder.append(_enumValuesCode, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <MultiLineString>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE 0");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <AttributeHelpText>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <AttributeRegularExpression>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("ATTRIBUTE <");
    String _name_1 = a.getName();
    _builder.append(_name_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("VALUE \"");
    Type _type_1 = a.getType();
    EnumType _enumtype_1 = _type_1.getEnumtype();
    Enumeration _name_2 = _enumtype_1.getName();
    EList<String> _enumvalues_1 = _name_2.getEnumvalues();
    String _get = _enumvalues_1.get(0);
    _builder.append(_get, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence toReference(final Reference ref) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ATTRIBUTE <");
    String _name = ref.getName();
    _builder.append(_name, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("TYPE INTERREF");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <MultiLineString>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE 0");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <AttributeHelpText>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <AttributeRegularExpression>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FACET <AttributeInterRefDomain>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"REFDOMAIN");
    _builder.newLine();
    _builder.append("\t");
    {
      RefName _refname = ref.getRefname();
      org.xtext.nv.dsl.mMDSL.Class _classname = _refname.getClassname();
      boolean _equals = Objects.equal(_classname, null);
      if (_equals) {
        _builder.append("MODREF");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("mt:\\\"");
        RefName _refname_1 = ref.getRefname();
        ModelType _modeltypename = _refname_1.getModeltypename();
        String _name_1 = _modeltypename.getName();
        _builder.append(_name_1, "	");
        _builder.append("\\\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      } else {
        _builder.append("OBJREF");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("mt:\\\"");
        RefName _refname_2 = ref.getRefname();
        ModelType _modeltypename_1 = _refname_2.getModeltypename();
        String _name_2 = _modeltypename_1.getName();
        _builder.append(_name_2, "	");
        _builder.append("\\\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("c:\\\"");
        RefName _refname_3 = ref.getRefname();
        org.xtext.nv.dsl.mMDSL.Class _classname_1 = _refname_3.getClassname();
        String _name_3 = _classname_1.getName();
        _builder.append(_name_3, "	");
        _builder.append("\\\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("ATTRIBUTE <");
    String _name_4 = ref.getName();
    _builder.append(_name_4, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("VALUE \"\"");
    _builder.newLine();
    return _builder;
  }
  
  public String toNotebook(final org.xtext.nv.dsl.mMDSL.Class c) {
    String notebook = "";
    boolean _and = false;
    EList<Attribute> _attribute = c.getAttribute();
    boolean _isEmpty = _attribute.isEmpty();
    if (!_isEmpty) {
      _and = false;
    } else {
      EList<Reference> _reference = c.getReference();
      boolean _isEmpty_1 = _reference.isEmpty();
      _and = (_isEmpty && _isEmpty_1);
    }
    if (_and) {
      return notebook;
    }
    EList<Attribute> _attribute_1 = c.getAttribute();
    boolean _isEmpty_2 = _attribute_1.isEmpty();
    boolean _not = (!_isEmpty_2);
    if (_not) {
      EList<Attribute> _attribute_2 = c.getAttribute();
      int _size = _attribute_2.size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for (final Integer i : _upTo) {
        {
          EList<Attribute> _attribute_3 = c.getAttribute();
          Attribute attr = _attribute_3.get((i).intValue());
          AccessType _access = attr.getAccess();
          boolean _equals = Objects.equal(_access, AccessType.WRITE);
          if (_equals) {
            String _plus = (notebook + "ATTR ");
            String _plus_1 = (_plus + "\\\"");
            String _name = attr.getName();
            String _plus_2 = (_plus_1 + _name);
            String _plus_3 = (_plus_2 + "\\\"");
            String _plus_4 = (_plus_3 + "\n");
            notebook = _plus_4;
          } else {
            AccessType _access_1 = attr.getAccess();
            boolean _equals_1 = Objects.equal(_access_1, AccessType.READ);
            if (_equals_1) {
              String _plus_5 = (notebook + "ATTR ");
              String _plus_6 = (_plus_5 + "\\\"");
              String _name_1 = attr.getName();
              String _plus_7 = (_plus_6 + _name_1);
              String _plus_8 = (_plus_7 + "\\\"");
              String _plus_9 = (_plus_8 + " write-protected");
              String _plus_10 = (_plus_9 + "\n");
              notebook = _plus_10;
            } else {
              String _plus_11 = (notebook + "#");
              String _plus_12 = (_plus_11 + "ATTR ");
              String _plus_13 = (_plus_12 + "\\\"");
              String _name_2 = attr.getName();
              String _plus_14 = (_plus_13 + _name_2);
              String _plus_15 = (_plus_14 + "\\\"");
              String _plus_16 = (_plus_15 + "\n");
              notebook = _plus_16;
            }
          }
        }
      }
    }
    EList<Reference> _reference_1 = c.getReference();
    boolean _isEmpty_3 = _reference_1.isEmpty();
    boolean _not_1 = (!_isEmpty_3);
    if (_not_1) {
      EList<Reference> _reference_2 = c.getReference();
      int _size_1 = _reference_2.size();
      int _minus_1 = (_size_1 - 1);
      IntegerRange _upTo_1 = new IntegerRange(0, _minus_1);
      for (final Integer i_1 : _upTo_1) {
        {
          EList<Reference> _reference_3 = c.getReference();
          Reference ref = _reference_3.get((i_1).intValue());
          String _plus = (notebook + "ATTR ");
          String _plus_1 = (_plus + "\\\"");
          String _name = ref.getName();
          String _plus_2 = (_plus_1 + _name);
          String _plus_3 = (_plus_2 + "\\\"");
          String _plus_4 = (_plus_3 + "\n");
          notebook = _plus_4;
        }
      }
    }
    return notebook;
  }
  
  /**
   * example: toNotebook(Car)
   * Car.attribute will contain: Name (per default), color, length, width, height, weight
   * attribute.access will be WRITE (all attributes are visible and values can be changed)
   */
  public String toNotebook(final Relation r) {
    String notebook = "";
    EList<Attribute> _attribute = r.getAttribute();
    boolean _isEmpty = _attribute.isEmpty();
    if (_isEmpty) {
      return notebook;
    }
    EList<Attribute> _attribute_1 = r.getAttribute();
    int _size = _attribute_1.size();
    int _minus = (_size - 1);
    IntegerRange _upTo = new IntegerRange(0, _minus);
    for (final Integer i : _upTo) {
      {
        EList<Attribute> _attribute_2 = r.getAttribute();
        Attribute attr = _attribute_2.get((i).intValue());
        AccessType _access = attr.getAccess();
        boolean _equals = Objects.equal(_access, AccessType.WRITE);
        if (_equals) {
          String _plus = (notebook + "ATTR ");
          String _plus_1 = (_plus + "\\\"");
          String _name = attr.getName();
          String _plus_2 = (_plus_1 + _name);
          String _plus_3 = (_plus_2 + "\\\"");
          String _plus_4 = (_plus_3 + "\n");
          notebook = _plus_4;
        } else {
          AccessType _access_1 = attr.getAccess();
          boolean _equals_1 = Objects.equal(_access_1, AccessType.READ);
          if (_equals_1) {
            String _plus_5 = (notebook + "ATTR ");
            String _plus_6 = (_plus_5 + "\\\"");
            String _name_1 = attr.getName();
            String _plus_7 = (_plus_6 + _name_1);
            String _plus_8 = (_plus_7 + "\\\"");
            String _plus_9 = (_plus_8 + " write-protected");
            String _plus_10 = (_plus_9 + "\n");
            notebook = _plus_10;
          } else {
            String _plus_11 = (notebook + "#");
            String _plus_12 = (_plus_11 + "ATTR ");
            String _plus_13 = (_plus_12 + "\\\"");
            String _name_2 = attr.getName();
            String _plus_14 = (_plus_13 + _name_2);
            String _plus_15 = (_plus_14 + "\\\"");
            String _plus_16 = (_plus_15 + "\n");
            notebook = _plus_16;
          }
        }
      }
    }
    return notebook;
  }
  
  public String RngColor() {
    Random _random = new Random();
    Random rand = _random;
    ArrayList<String> _arrayList = new ArrayList<String>();
    ArrayList<String> colors = _arrayList;
    CollectionExtensions.<String>addAll(colors, 
      "red", 
      "blue", 
      "green", 
      "yellow", 
      "pink", 
      "orange", 
      "silver", 
      "black", 
      "azure", 
      "aqua", 
      "coral", 
      "aqua", 
      "brown", 
      "gold", 
      "gray", 
      "navy", 
      "violet", 
      "darkblue", 
      "blueviolet", 
      "crimson");
    int colornum = rand.nextInt(19);
    return colors.get(colornum);
  }
  
  public String RngRectangle() {
    Random _random = new Random();
    Random rand = _random;
    int _nextInt = rand.nextInt(40);
    int rectsize = (_nextInt + 11);
    int _divide = (rectsize / 2);
    String _plus = ("RECTANGLE x:-" + Integer.valueOf(_divide));
    String _plus_1 = (_plus + "pt y:-");
    int _divide_1 = (rectsize / 2);
    String _plus_2 = (_plus_1 + Integer.valueOf(_divide_1));
    String _plus_3 = (_plus_2 + "pt h:");
    String _plus_4 = (_plus_3 + Integer.valueOf(rectsize));
    String _plus_5 = (_plus_4 + "pt w:");
    String _plus_6 = (_plus_5 + Integer.valueOf(rectsize));
    String rectangle = (_plus_6 + "pt");
    int _divide_2 = (rectsize / 2);
    int _plus_7 = (_divide_2 + 1);
    String _plus_8 = ("ATTR \\\"Name\\\" x:0pt y:" + Integer.valueOf(_plus_7));
    String name = (_plus_8 + "pt w:c");
    String _plus_9 = (rectangle + "\n");
    String command = (_plus_9 + name);
    return command;
  }
  
  public String RngEllipse() {
    Random _random = new Random();
    Random rand = _random;
    int _nextInt = rand.nextInt(40);
    int ellsizex = (_nextInt + 11);
    int _nextInt_1 = rand.nextInt(40);
    int ellsizey = (_nextInt_1 + 11);
    String _plus = ("ELLIPSE x:0pt y:0pt rx:" + Integer.valueOf(ellsizex));
    String _plus_1 = (_plus + "pt ry:");
    String _plus_2 = (_plus_1 + Integer.valueOf(ellsizey));
    String ellipse = (_plus_2 + "pt");
    int _plus_3 = (ellsizey + 1);
    String _plus_4 = ("ATTR \\\"Name\\\" x:0pt y:" + Integer.valueOf(_plus_3));
    String name = (_plus_4 + "pt w:c");
    String _plus_5 = (ellipse + "\n");
    String command = (_plus_5 + name);
    return command;
  }
  
  public String RngSymbol() {
    String _xblockexpression = null;
    {
      Random _random = new Random();
      Random rand = _random;
      int select = rand.nextInt(2);
      String _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(select,0)) {
          _matched=true;
          String _RngEllipse = this.RngEllipse();
          _switchResult = _RngEllipse;
        }
      }
      if (!_matched) {
        String _RngRectangle = this.RngRectangle();
        _switchResult = _RngRectangle;
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
  
  public CharSequence GenerateRandomClassSymbol() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("PEN color:");
    String _RngColor = this.RngColor();
    _builder.append(_RngColor, "");
    _builder.append(" w:2pt");
    _builder.newLineIfNotEmpty();
    _builder.append("FILL color:");
    String _RngColor_1 = this.RngColor();
    _builder.append(_RngColor_1, "");
    _builder.newLineIfNotEmpty();
    String _RngSymbol = this.RngSymbol();
    _builder.append(_RngSymbol, "");
    return _builder;
  }
  
  public CharSequence GenerateRandomRelationSymobl() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("PEN color:black w:1pt");
    _builder.newLine();
    _builder.append("FILL color:");
    String _RngColor = this.RngColor();
    _builder.append(_RngColor, "");
    _builder.newLineIfNotEmpty();
    _builder.append("START");
    _builder.newLine();
    _builder.append("#none");
    _builder.newLine();
    _builder.append("MIDDLE");
    _builder.newLine();
    _builder.append("#normal line");
    _builder.newLine();
    _builder.append("END");
    _builder.newLine();
    _builder.append("POLYGON 3 x1:-5pt y1:3pt x2:0pt y2:0pt x3:-5pt y3:-3pt");
    _builder.newLine();
    return _builder;
  }
  
  public String InsertCodeSnippet(final EmbedCode ec) {
    return ec.getEmbeddedcode();
  }
  
  public int toGraphRepCoordinate(final int svgx) {
    int _minus = (-svgx);
    return (_minus / 2);
  }
  
  public String defaultStyle() {
    String pen = "PEN color:black w:1pt\n";
    String fill = "FILL color:black\n";
    return (pen + fill);
  }
  
  public String applyStyle(final SymbolStyle ss) {
    String command = "";
    boolean _equals = Objects.equal(ss, null);
    if (_equals) {
      return command;
    }
    StrokeColor _strokecolor = ss.getStrokecolor();
    String _hexcolor = _strokecolor.getHexcolor();
    boolean _notEquals = (!Objects.equal(_hexcolor, null));
    if (_notEquals) {
      String _plus = ("PEN color:" + command);
      StrokeColor _strokecolor_1 = ss.getStrokecolor();
      String _hexcolor_1 = _strokecolor_1.getHexcolor();
      String _graphRepColor = this.toGraphRepColor(_hexcolor_1);
      String _plus_1 = (_plus + _graphRepColor);
      command = _plus_1;
    } else {
      String _plus_2 = ("PEN color:" + command);
      StrokeColor _strokecolor_2 = ss.getStrokecolor();
      Color _color = _strokecolor_2.getColor();
      String _plus_3 = (_plus_2 + _color);
      command = _plus_3;
    }
    String _plus_4 = (command + " w:");
    String _strokewidth = ss.getStrokewidth();
    String _plus_5 = (_plus_4 + _strokewidth);
    String _plus_6 = (_plus_5 + "pt");
    String _plus_7 = (_plus_6 + "\n");
    command = _plus_7;
    String _plus_8 = (command + "FILL color:");
    command = _plus_8;
    FillColor _fillcolor = ss.getFillcolor();
    String _hexcolor_2 = _fillcolor.getHexcolor();
    boolean _notEquals_1 = (!Objects.equal(_hexcolor_2, null));
    if (_notEquals_1) {
      FillColor _fillcolor_1 = ss.getFillcolor();
      String _hexcolor_3 = _fillcolor_1.getHexcolor();
      String _graphRepColor_1 = this.toGraphRepColor(_hexcolor_3);
      String _plus_9 = (command + _graphRepColor_1);
      command = _plus_9;
    } else {
      FillColor _fillcolor_2 = ss.getFillcolor();
      Color _color_1 = _fillcolor_2.getColor();
      String _plus_10 = (command + _color_1);
      String _plus_11 = (_plus_10 + "\n");
      command = _plus_11;
    }
    return command;
  }
  
  public String generateCSymbol(final org.xtext.nv.dsl.mMDSL.Class c) {
    String command = "";
    SymbolClass _symbolclass = c.getSymbolclass();
    EList<SVGCommand> _svgcommand = _symbolclass.getSvgcommand();
    for (final SVGCommand svgc : _svgcommand) {
      {
        SymbolStyle _symbolstyle = svgc.getSymbolstyle();
        boolean _notEquals = (!Objects.equal(_symbolstyle, null));
        if (_notEquals) {
          SymbolStyle _symbolstyle_1 = svgc.getSymbolstyle();
          String _applyStyle = this.applyStyle(_symbolstyle_1);
          String _plus = (command + _applyStyle);
          command = _plus;
        } else {
          SymbolStyle _symbolstyleref = svgc.getSymbolstyleref();
          boolean _notEquals_1 = (!Objects.equal(_symbolstyleref, null));
          if (_notEquals_1) {
            SymbolStyle _symbolstyleref_1 = svgc.getSymbolstyleref();
            String _applyStyle_1 = this.applyStyle(_symbolstyleref_1);
            String _plus_1 = (command + _applyStyle_1);
            command = _plus_1;
          } else {
            SymbolClass _symbolclass_1 = c.getSymbolclass();
            SymbolStyle _globalstyle = _symbolclass_1.getGlobalstyle();
            boolean _notEquals_2 = (!Objects.equal(_globalstyle, null));
            if (_notEquals_2) {
              SymbolClass _symbolclass_2 = c.getSymbolclass();
              SymbolStyle _globalstyle_1 = _symbolclass_2.getGlobalstyle();
              String _applyStyle_2 = this.applyStyle(_globalstyle_1);
              String _plus_2 = (command + _applyStyle_2);
              command = _plus_2;
            } else {
              String _defaultStyle = this.defaultStyle();
              String _plus_3 = (command + _defaultStyle);
              command = _plus_3;
            }
          }
        }
        String _graphRepCommand = this.toGraphRepCommand(svgc);
        String _plus_4 = (command + _graphRepCommand);
        command = _plus_4;
      }
    }
    return command;
  }
  
  public String generateRSymobl(final Relation r) {
    String command = "START\n";
    SymbolRelation _symbolrelation = r.getSymbolrelation();
    EList<SVGCommand> _svgcommandsfrom = _symbolrelation.getSvgcommandsfrom();
    for (final SVGCommand svgcfrom : _svgcommandsfrom) {
      {
        SymbolStyle _symbolstyle = svgcfrom.getSymbolstyle();
        boolean _notEquals = (!Objects.equal(_symbolstyle, null));
        if (_notEquals) {
          SymbolStyle _symbolstyle_1 = svgcfrom.getSymbolstyle();
          String _applyStyle = this.applyStyle(_symbolstyle_1);
          String _plus = (command + _applyStyle);
          command = _plus;
        } else {
          SymbolStyle _symbolstyleref = svgcfrom.getSymbolstyleref();
          boolean _notEquals_1 = (!Objects.equal(_symbolstyleref, null));
          if (_notEquals_1) {
            SymbolStyle _symbolstyleref_1 = svgcfrom.getSymbolstyleref();
            String _applyStyle_1 = this.applyStyle(_symbolstyleref_1);
            String _plus_1 = (command + _applyStyle_1);
            command = _plus_1;
          } else {
            SymbolRelation _symbolrelation_1 = r.getSymbolrelation();
            SymbolStyle _globalstyle = _symbolrelation_1.getGlobalstyle();
            boolean _notEquals_2 = (!Objects.equal(_globalstyle, null));
            if (_notEquals_2) {
              SymbolRelation _symbolrelation_2 = r.getSymbolrelation();
              SymbolStyle _globalstyle_1 = _symbolrelation_2.getGlobalstyle();
              String _applyStyle_2 = this.applyStyle(_globalstyle_1);
              String _plus_2 = (command + _applyStyle_2);
              command = _plus_2;
            } else {
              String _defaultStyle = this.defaultStyle();
              String _plus_3 = (command + _defaultStyle);
              command = _plus_3;
            }
          }
        }
        String _graphRepCommand = this.toGraphRepCommand(svgcfrom);
        String _plus_4 = (command + _graphRepCommand);
        command = _plus_4;
      }
    }
    String _plus = (command + "MIDDLE\n");
    command = _plus;
    SymbolRelation _symbolrelation_1 = r.getSymbolrelation();
    EList<SVGCommand> _svgcommandsmiddle = _symbolrelation_1.getSvgcommandsmiddle();
    for (final SVGCommand svgcline : _svgcommandsmiddle) {
      {
        SymbolStyle _symbolstyle = svgcline.getSymbolstyle();
        boolean _notEquals = (!Objects.equal(_symbolstyle, null));
        if (_notEquals) {
          SymbolStyle _symbolstyle_1 = svgcline.getSymbolstyle();
          String _applyStyle = this.applyStyle(_symbolstyle_1);
          String _plus_1 = (command + _applyStyle);
          command = _plus_1;
        } else {
          SymbolStyle _symbolstyleref = svgcline.getSymbolstyleref();
          boolean _notEquals_1 = (!Objects.equal(_symbolstyleref, null));
          if (_notEquals_1) {
            SymbolStyle _symbolstyleref_1 = svgcline.getSymbolstyleref();
            String _applyStyle_1 = this.applyStyle(_symbolstyleref_1);
            String _plus_2 = (command + _applyStyle_1);
            command = _plus_2;
          } else {
            SymbolRelation _symbolrelation_2 = r.getSymbolrelation();
            SymbolStyle _globalstyle = _symbolrelation_2.getGlobalstyle();
            boolean _notEquals_2 = (!Objects.equal(_globalstyle, null));
            if (_notEquals_2) {
              SymbolRelation _symbolrelation_3 = r.getSymbolrelation();
              SymbolStyle _globalstyle_1 = _symbolrelation_3.getGlobalstyle();
              String _applyStyle_2 = this.applyStyle(_globalstyle_1);
              String _plus_3 = (command + _applyStyle_2);
              command = _plus_3;
            } else {
              String _defaultStyle = this.defaultStyle();
              String _plus_4 = (command + _defaultStyle);
              command = _plus_4;
            }
          }
        }
        String _graphRepCommand = this.toGraphRepCommand(svgcline);
        String _plus_5 = (command + _graphRepCommand);
        command = _plus_5;
      }
    }
    String _plus_1 = (command + "END\n");
    command = _plus_1;
    SymbolRelation _symbolrelation_2 = r.getSymbolrelation();
    EList<SVGCommand> _svgcommandsto = _symbolrelation_2.getSvgcommandsto();
    for (final SVGCommand svgcto : _svgcommandsto) {
      {
        SymbolStyle _symbolstyle = svgcto.getSymbolstyle();
        boolean _notEquals = (!Objects.equal(_symbolstyle, null));
        if (_notEquals) {
          SymbolStyle _symbolstyle_1 = svgcto.getSymbolstyle();
          String _applyStyle = this.applyStyle(_symbolstyle_1);
          String _plus_2 = (command + _applyStyle);
          command = _plus_2;
        } else {
          SymbolStyle _symbolstyleref = svgcto.getSymbolstyleref();
          boolean _notEquals_1 = (!Objects.equal(_symbolstyleref, null));
          if (_notEquals_1) {
            SymbolStyle _symbolstyleref_1 = svgcto.getSymbolstyleref();
            String _applyStyle_1 = this.applyStyle(_symbolstyleref_1);
            String _plus_3 = (command + _applyStyle_1);
            command = _plus_3;
          } else {
            SymbolRelation _symbolrelation_3 = r.getSymbolrelation();
            SymbolStyle _globalstyle = _symbolrelation_3.getGlobalstyle();
            boolean _notEquals_2 = (!Objects.equal(_globalstyle, null));
            if (_notEquals_2) {
              SymbolRelation _symbolrelation_4 = r.getSymbolrelation();
              SymbolStyle _globalstyle_1 = _symbolrelation_4.getGlobalstyle();
              String _applyStyle_2 = this.applyStyle(_globalstyle_1);
              String _plus_4 = (command + _applyStyle_2);
              command = _plus_4;
            } else {
              String _defaultStyle = this.defaultStyle();
              String _plus_5 = (command + _defaultStyle);
              command = _plus_5;
            }
          }
        }
        String _graphRepCommand = this.toGraphRepCommand(svgcto);
        String _plus_6 = (command + _graphRepCommand);
        command = _plus_6;
      }
    }
    return command;
  }
  
  public String toGraphRepColor(final String hex) {
    String _substring = hex.substring(1, 7);
    return ("$" + _substring);
  }
  
  public String toGraphRepCommand(final SVGCommand svg) {
    String command = "";
    boolean _equals = Objects.equal(svg, null);
    if (_equals) {
      return command;
    }
    Rectangle _rectangle = svg.getRectangle();
    boolean _notEquals = (!Objects.equal(_rectangle, null));
    if (_notEquals) {
      final Rectangle r = svg.getRectangle();
      String _plus = ("RECTANGLE" + 
        " x:");
      String _x = r.getX();
      String _plus_1 = (_plus + _x);
      String _plus_2 = (_plus_1 + "pt");
      String _plus_3 = (_plus_2 + 
        " y:");
      String _y = r.getY();
      String _plus_4 = (_plus_3 + _y);
      String _plus_5 = (_plus_4 + "pt");
      String _plus_6 = (_plus_5 + 
        " h:");
      String _width = r.getWidth();
      String _plus_7 = (_plus_6 + _width);
      String _plus_8 = (_plus_7 + "pt");
      String _plus_9 = (_plus_8 + 
        " w:");
      String _height = r.getHeight();
      String _plus_10 = (_plus_9 + _height);
      String _plus_11 = (_plus_10 + "pt");
      command = _plus_11;
    } else {
      Circle _circle = svg.getCircle();
      boolean _notEquals_1 = (!Objects.equal(_circle, null));
      if (_notEquals_1) {
        final Circle c = svg.getCircle();
        String _plus_12 = ("ELLIPSE" + 
          " x:");
        String _cx = c.getCx();
        String _plus_13 = (_plus_12 + _cx);
        String _plus_14 = (_plus_13 + "pt");
        String _plus_15 = (_plus_14 + 
          " y:");
        String _cy = c.getCy();
        String _plus_16 = (_plus_15 + _cy);
        String _plus_17 = (_plus_16 + "pt");
        String _plus_18 = (_plus_17 + 
          " rx:");
        String _r = c.getR();
        String _plus_19 = (_plus_18 + _r);
        String _plus_20 = (_plus_19 + "pt");
        String _plus_21 = (_plus_20 + 
          " ry:");
        String _r_1 = c.getR();
        String _plus_22 = (_plus_21 + _r_1);
        String _plus_23 = (_plus_22 + "pt");
        command = _plus_23;
      } else {
        Ellipse _ellipse = svg.getEllipse();
        boolean _notEquals_2 = (!Objects.equal(_ellipse, null));
        if (_notEquals_2) {
          final Ellipse e = svg.getEllipse();
          String _plus_24 = ("ELLIPSE" + 
            " x:");
          String _cx_1 = e.getCx();
          String _plus_25 = (_plus_24 + _cx_1);
          String _plus_26 = (_plus_25 + "pt");
          String _plus_27 = (_plus_26 + 
            " y:");
          String _cy_1 = e.getCy();
          String _plus_28 = (_plus_27 + _cy_1);
          String _plus_29 = (_plus_28 + "pt");
          String _plus_30 = (_plus_29 + 
            " rx:");
          String _rx = e.getRx();
          String _plus_31 = (_plus_30 + _rx);
          String _plus_32 = (_plus_31 + "pt");
          String _plus_33 = (_plus_32 + 
            " ry:");
          String _ry = e.getRy();
          String _plus_34 = (_plus_33 + _ry);
          String _plus_35 = (_plus_34 + "pt");
          command = _plus_35;
        } else {
          Line _line = svg.getLine();
          boolean _notEquals_3 = (!Objects.equal(_line, null));
          if (_notEquals_3) {
            final Line l = svg.getLine();
            String _plus_36 = ("LINE" + 
              " x1:");
            String _x1 = l.getX1();
            String _plus_37 = (_plus_36 + _x1);
            String _plus_38 = (_plus_37 + "pt");
            String _plus_39 = (_plus_38 + 
              " y1:");
            String _y1 = l.getY1();
            String _plus_40 = (_plus_39 + _y1);
            String _plus_41 = (_plus_40 + "pt");
            String _plus_42 = (_plus_41 + 
              " x2:");
            String _x2 = l.getX2();
            String _plus_43 = (_plus_42 + _x2);
            String _plus_44 = (_plus_43 + "pt");
            String _plus_45 = (_plus_44 + 
              " y2:");
            String _y2 = l.getY2();
            String _plus_46 = (_plus_45 + _y2);
            String _plus_47 = (_plus_46 + "pt");
            command = _plus_47;
          } else {
            Polyline _polyline = svg.getPolyline();
            boolean _notEquals_4 = (!Objects.equal(_polyline, null));
            if (_notEquals_4) {
              final Polyline pl = svg.getPolyline();
              EList<Points> _points = pl.getPoints();
              int _size = _points.size();
              String _plus_48 = ("POLYLINE " + Integer.valueOf(_size));
              command = _plus_48;
              EList<Points> _points_1 = pl.getPoints();
              int _size_1 = _points_1.size();
              ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size_1, true);
              for (final Integer i : _doubleDotLessThan) {
                {
                  EList<Points> _points_2 = pl.getPoints();
                  Points point = _points_2.get((i).intValue());
                  int p = ((i).intValue() + 1);
                  String _plus_49 = (command + " x");
                  String _plus_50 = (_plus_49 + Integer.valueOf(p));
                  String _plus_51 = (_plus_50 + ":");
                  String _x_1 = point.getX();
                  String _plus_52 = (_plus_51 + _x_1);
                  String _plus_53 = (_plus_52 + "pt");
                  String _plus_54 = (_plus_53 + " y");
                  String _plus_55 = (_plus_54 + Integer.valueOf(p));
                  String _plus_56 = (_plus_55 + ":");
                  String _y_1 = point.getY();
                  String _plus_57 = (_plus_56 + _y_1);
                  String _plus_58 = (_plus_57 + "pt");
                  command = _plus_58;
                }
              }
            } else {
              Polygon _polygon = svg.getPolygon();
              boolean _notEquals_5 = (!Objects.equal(_polygon, null));
              if (_notEquals_5) {
                final Polygon po = svg.getPolygon();
                EList<Points> _points_2 = po.getPoints();
                int _size_2 = _points_2.size();
                String _plus_49 = ("POLYGON " + Integer.valueOf(_size_2));
                command = _plus_49;
                EList<Points> _points_3 = po.getPoints();
                int _size_3 = _points_3.size();
                ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_3, true);
                for (final Integer i_1 : _doubleDotLessThan_1) {
                  {
                    EList<Points> _points_4 = po.getPoints();
                    Points point = _points_4.get((i_1).intValue());
                    int p = ((i_1).intValue() + 1);
                    String _plus_50 = (command + " x");
                    String _plus_51 = (_plus_50 + Integer.valueOf(p));
                    String _plus_52 = (_plus_51 + ":");
                    String _x_1 = point.getX();
                    String _plus_53 = (_plus_52 + _x_1);
                    String _plus_54 = (_plus_53 + "pt");
                    String _plus_55 = (_plus_54 + " y");
                    String _plus_56 = (_plus_55 + Integer.valueOf(p));
                    String _plus_57 = (_plus_56 + ":");
                    String _y_1 = point.getY();
                    String _plus_58 = (_plus_57 + _y_1);
                    String _plus_59 = (_plus_58 + "pt");
                    command = _plus_59;
                  }
                }
              } else {
                Path _path = svg.getPath();
                boolean _notEquals_6 = (!Objects.equal(_path, null));
                if (_notEquals_6) {
                } else {
                  Text _text = svg.getText();
                  boolean _notEquals_7 = (!Objects.equal(_text, null));
                  if (_notEquals_7) {
                    final Text t = svg.getText();
                    String _plus_50 = ("TEXT " + 
                      "\\\"");
                    String _value = t.getValue();
                    String _plus_51 = (_plus_50 + _value);
                    String _plus_52 = (_plus_51 + "\\\"");
                    String _plus_53 = (_plus_52 + 
                      " x:");
                    String _x_1 = t.getX();
                    String _plus_54 = (_plus_53 + _x_1);
                    String _plus_55 = (_plus_54 + "pt");
                    String _plus_56 = (_plus_55 + 
                      " y:");
                    String _y_1 = t.getY();
                    String _plus_57 = (_plus_56 + _y_1);
                    String _plus_58 = (_plus_57 + "pt");
                    command = _plus_58;
                  } else {
                    InsertEmbedCode _insertembedcode = svg.getInsertembedcode();
                    EmbedCode _codesnippetname = _insertembedcode.getCodesnippetname();
                    final String code = _codesnippetname.getEmbeddedcode();
                    command = code;
                  }
                }
              }
            }
          }
        }
      }
    }
    return (command + "\n");
  }
  
  public String GetCurrentDate() {
    SimpleDateFormat _simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy, HH:mm");
    SimpleDateFormat sdfDate = _simpleDateFormat;
    Date _date = new Date();
    return sdfDate.format(_date);
  }
  
  public String AlgorithmSimpleUIInfoBox(final InfoBox infobox) {
    String _text = infobox.getText();
    String _plus = ("CC \\\"AdoScript\\\" INFOBOX \\\"" + _text);
    String _plus_1 = (_plus + "\\\" title:\\\"");
    String _title = infobox.getTitle();
    String _plus_2 = (_plus_1 + _title);
    String command = (_plus_2 + "\\\"");
    return command;
  }
  
  public String AlgorithmSimpleUIErrorBox(final ErrorBox errorbox) {
    String _text = errorbox.getText();
    String _plus = ("CC \\\"AdoScript\\\" ERRORBOX \\\"" + _text);
    String _plus_1 = (_plus + "\\\" title:\\\"");
    String _title = errorbox.getTitle();
    String _plus_2 = (_plus_1 + _title);
    String command = (_plus_2 + "\\\"");
    String _plus_3 = (command + " ");
    ButtonType _buttontype = errorbox.getButtontype();
    String _plus_4 = (_plus_3 + _buttontype);
    command = _plus_4;
    return command;
  }
  
  public String AlgorithmSimpleUIWarningBox(final WarningBox warningbox) {
    String _text = warningbox.getText();
    String _plus = ("CC \\\"AdoScript\\\" WARNINGBOX \\\"" + _text);
    String _plus_1 = (_plus + "\\\" title:\\\"");
    String _title = warningbox.getTitle();
    String _plus_2 = (_plus_1 + _title);
    String command = (_plus_2 + "\\\"");
    String _plus_3 = (command + " ");
    ButtonType _buttontype = warningbox.getButtontype();
    String _plus_4 = (_plus_3 + _buttontype);
    command = _plus_4;
    return command;
  }
  
  public String AlgorithmSimpleUIViewBox(final ViewBox viewbox) {
    String _text = viewbox.getText();
    String _plus = ("CC \\\"AdoScript\\\" VIEWBOX \\\"" + _text);
    String _plus_1 = (_plus + "\\\" title:\\\"");
    String _title = viewbox.getTitle();
    String _plus_2 = (_plus_1 + _title);
    String command = (_plus_2 + "\\\"");
    return command;
  }
  
  public String AlgorithmSimpleUIInsertMenuItem(final InsertMenuItem insertmenuitem) {
    String _name = insertmenuitem.getName();
    String _plus = ("ITEM \\\"" + _name);
    String _plus_1 = (_plus + "\\\" modeling:\\\"");
    String _menu = insertmenuitem.getMenu();
    String _plus_2 = (_plus_1 + _menu);
    String command = (_plus_2 + "\\\"");
    return command;
  }
  
  public String AlgorithmSimpleUIRemoveMenuItem(final RemoveMenuItem removemenuitem) {
    InsertMenuItem _menuitemname = removemenuitem.getMenuitemname();
    String _plus = ("CC \\\"Application\\\" REMOVE_MENU_ITEM \\\" component:\\\"modeling\\\" \\\"" + _menuitemname);
    String command = (_plus + "\\\"");
    return command;
  }
  
  public String AlgorithmFileCopy(final FileCopy filecopy) {
    String _src = filecopy.getSrc();
    String _plus = ("CC \\\"AdoScript\\\" COPY_FILES \\\"" + _src);
    String _plus_1 = (_plus + "\\\" to:\\\"");
    String _dest = filecopy.getDest();
    String _plus_2 = (_plus_1 + _dest);
    String command = (_plus_2 + "\\\"");
    return command;
  }
  
  public String AlgorithmFileDelete(final FileDelete filedelete) {
    String _filename = filedelete.getFilename();
    String _plus = ("CC \\\"AdoScript\\\" FILE_DELETE file: \\\"" + _filename);
    String command = (_plus + "\\\"");
    return command;
  }
  
  public String AlgorithmFileCreate(final FileCreate filecreate) {
    String command = "";
    return command;
  }
  
  public String AlgorithmFileRead(final FileRead fileread) {
    String _filename = fileread.getFilename();
    String _plus = ("CC \\\"AdoScript\\\" FREAD file: \\\"" + _filename);
    String command = (_plus + "\\\"");
    return command;
  }
  
  public String AlgorithmFileWrite(final FileWrite filewrite) {
    String _filename = filewrite.getFilename();
    String _plus = ("CC \\\"AdoScript\\\" FWRITE file: \\\"" + _filename);
    String _plus_1 = (_plus + "\\\" text: \\\"");
    String _text = filewrite.getText();
    String _plus_2 = (_plus_1 + _text);
    String command = (_plus_2 + "\\\"");
    String _append = filewrite.getAppend();
    boolean _notEquals = (!Objects.equal(_append, null));
    if (_notEquals) {
      String _plus_3 = (command + " append:1");
      command = _plus_3;
    }
    return command;
  }
  
  public Object AlgorithmDirSetWorking(final DirSetWorking setworking) {
    return null;
  }
  
  public Object AlgorithmDirGetWorking(final DirGetWorking getworking) {
    return null;
  }
  
  public String AlgorithmDirCreate(final DirCreate dircreate) {
    String _dirname = dircreate.getDirname();
    String _plus = ("CC \\\"AdoScript\\\" DIR_CREATE path: \\\"" + _dirname);
    String command = (_plus + "\\\"");
    return command;
  }
  
  public Object AlgorithmDirDelete(final DirDelete dirdelete) {
    return null;
  }
  
  public String AlgorithmDirList(final DirList dirlist) {
    String _dirname = dirlist.getDirname();
    String _plus = ("CC \\\"AdoScript\\\" DIR_LIST path: \\\"" + _dirname);
    String command = (_plus + "\\\"");
    return command;
  }
  
  public Object AlgorithmModelCreate(final ModelCreate modelcreate) {
    return null;
  }
  
  public Object AlgorithmModelDelete(final ModelDelete modeldelete) {
    return null;
  }
  
  public Object AlgorithmModelDiscard(final ModelDiscard modeldiscard) {
    return null;
  }
  
  public Object AlgorithmModelSave(final ModelSave modelsave) {
    return null;
  }
  
  public Object AlgorithmModelLoad(final ModelLoad modelload) {
    return null;
  }
  
  public Object AlgorithmModelIsLoaded(final ModelIsLoaded modelisloaded) {
    return null;
  }
  
  public Object AlgorithmInstanceClassCreate(final ClassInstanceCreate cicreate) {
    return null;
  }
  
  public Object AlgorithmInstanceClassDelete(final ClassInstanceDelete cidelete) {
    return null;
  }
  
  public Object AlgorithmInstanceClassGet(final ClassInstanceGet ciget) {
    return null;
  }
  
  public Object AlgorithmInstanceClassGetAll(final ClassInstanceGetAll cigetall) {
    return null;
  }
  
  public Object AlgorithmInstanceClassSet(final ClassInstanceSet ciset) {
    return null;
  }
  
  public Object AlgorithmInstanceRelationCreate(final RelationInstanceCreate ricreate) {
    return null;
  }
  
  public Object AlgorithmInstanceRelationDelete(final RelationInstanceDelete ridelete) {
    return null;
  }
  
  public Object AlgorithmInstanceRelationGet(final RelationInstanceGet riget) {
    return null;
  }
  
  public Object AlgorithmInstanceRelationGetAll(final RelationInstanceGetAll rigetall) {
    return null;
  }
  
  public Object AlgorithmInstanceRelationSet(final RelationInstanceSet riset) {
    return null;
  }
  
  public Object AlgorithmAttributeGet(final AttributeGet aget) {
    return null;
  }
  
  public Object AlgorithmAttributeSet(final AttributeSet aset) {
    return null;
  }
  
  public String GenerateAlgorithmOperation(final AlgorithmOperation algop) {
    try {
      String command = "";
      FileOperation _fileoperation = algop.getFileoperation();
      boolean _notEquals = (!Objects.equal(_fileoperation, null));
      if (_notEquals) {
        FileOperation _fileoperation_1 = algop.getFileoperation();
        FileCopy _filecopy = _fileoperation_1.getFilecopy();
        boolean _notEquals_1 = (!Objects.equal(_filecopy, null));
        if (_notEquals_1) {
        } else {
          FileOperation _fileoperation_2 = algop.getFileoperation();
          FileCreate _filecreate = _fileoperation_2.getFilecreate();
          boolean _notEquals_2 = (!Objects.equal(_filecreate, null));
          if (_notEquals_2) {
          } else {
            FileOperation _fileoperation_3 = algop.getFileoperation();
            FileDelete _filedelete = _fileoperation_3.getFiledelete();
            boolean _notEquals_3 = (!Objects.equal(_filedelete, null));
            if (_notEquals_3) {
            } else {
              FileOperation _fileoperation_4 = algop.getFileoperation();
              FileRead _fileread = _fileoperation_4.getFileread();
              boolean _notEquals_4 = (!Objects.equal(_fileread, null));
              if (_notEquals_4) {
              } else {
              }
            }
          }
        }
      } else {
        DirOperation _diroperation = algop.getDiroperation();
        boolean _notEquals_5 = (!Objects.equal(_diroperation, null));
        if (_notEquals_5) {
          DirOperation _diroperation_1 = algop.getDiroperation();
          DirCreate _dircreate = _diroperation_1.getDircreate();
          boolean _notEquals_6 = (!Objects.equal(_dircreate, null));
          if (_notEquals_6) {
          } else {
            DirOperation _diroperation_2 = algop.getDiroperation();
            DirDelete _dirdelete = _diroperation_2.getDirdelete();
            boolean _notEquals_7 = (!Objects.equal(_dirdelete, null));
            if (_notEquals_7) {
            } else {
              DirOperation _diroperation_3 = algop.getDiroperation();
              DirList _dirlist = _diroperation_3.getDirlist();
              boolean _notEquals_8 = (!Objects.equal(_dirlist, null));
              if (_notEquals_8) {
              } else {
              }
            }
          }
        } else {
          SimpleUI _simpleui = algop.getSimpleui();
          boolean _notEquals_9 = (!Objects.equal(_simpleui, null));
          if (_notEquals_9) {
            SimpleUI _simpleui_1 = algop.getSimpleui();
            EditBox _editbox = _simpleui_1.getEditbox();
            boolean _notEquals_10 = (!Objects.equal(_editbox, null));
            if (_notEquals_10) {
            } else {
              SimpleUI _simpleui_2 = algop.getSimpleui();
              InfoBox _infobox = _simpleui_2.getInfobox();
              boolean _notEquals_11 = (!Objects.equal(_infobox, null));
              if (_notEquals_11) {
                SimpleUI _simpleui_3 = algop.getSimpleui();
                InfoBox _infobox_1 = _simpleui_3.getInfobox();
                String _AlgorithmSimpleUIInfoBox = this.AlgorithmSimpleUIInfoBox(_infobox_1);
                String _plus = (command + _AlgorithmSimpleUIInfoBox);
                String _plus_1 = (_plus + "\n");
                command = _plus_1;
              } else {
                SimpleUI _simpleui_4 = algop.getSimpleui();
                ErrorBox _errorbox = _simpleui_4.getErrorbox();
                boolean _notEquals_12 = (!Objects.equal(_errorbox, null));
                if (_notEquals_12) {
                  SimpleUI _simpleui_5 = algop.getSimpleui();
                  ErrorBox _errorbox_1 = _simpleui_5.getErrorbox();
                  String _AlgorithmSimpleUIErrorBox = this.AlgorithmSimpleUIErrorBox(_errorbox_1);
                  String _plus_2 = (command + _AlgorithmSimpleUIErrorBox);
                  String _plus_3 = (_plus_2 + "\n");
                  command = _plus_3;
                } else {
                  SimpleUI _simpleui_6 = algop.getSimpleui();
                  WarningBox _warningbox = _simpleui_6.getWarningbox();
                  boolean _notEquals_13 = (!Objects.equal(_warningbox, null));
                  if (_notEquals_13) {
                    SimpleUI _simpleui_7 = algop.getSimpleui();
                    WarningBox _warningbox_1 = _simpleui_7.getWarningbox();
                    String _AlgorithmSimpleUIWarningBox = this.AlgorithmSimpleUIWarningBox(_warningbox_1);
                    String _plus_4 = (command + _AlgorithmSimpleUIWarningBox);
                    String _plus_5 = (_plus_4 + "\n");
                    command = _plus_5;
                  } else {
                    SimpleUI _simpleui_8 = algop.getSimpleui();
                    ViewBox _viewbox = _simpleui_8.getViewbox();
                    boolean _notEquals_14 = (!Objects.equal(_viewbox, null));
                    if (_notEquals_14) {
                      SimpleUI _simpleui_9 = algop.getSimpleui();
                      ViewBox _viewbox_1 = _simpleui_9.getViewbox();
                      String _AlgorithmSimpleUIViewBox = this.AlgorithmSimpleUIViewBox(_viewbox_1);
                      String _plus_6 = (command + _AlgorithmSimpleUIViewBox);
                      String _plus_7 = (_plus_6 + "\n");
                      command = _plus_7;
                    } else {
                      SimpleUI _simpleui_10 = algop.getSimpleui();
                      ItemOperation _itemoperation = _simpleui_10.getItemoperation();
                      MenuItem _menuitem = _itemoperation.getMenuitem();
                      boolean _notEquals_15 = (!Objects.equal(_menuitem, null));
                      if (_notEquals_15) {
                        SimpleUI _simpleui_11 = algop.getSimpleui();
                        ItemOperation _itemoperation_1 = _simpleui_11.getItemoperation();
                        MenuItem _menuitem_1 = _itemoperation_1.getMenuitem();
                        InsertMenuItem _insertmenuitem = _menuitem_1.getInsertmenuitem();
                        boolean _notEquals_16 = (!Objects.equal(_insertmenuitem, null));
                        if (_notEquals_16) {
                          SimpleUI _simpleui_12 = algop.getSimpleui();
                          ItemOperation _itemoperation_2 = _simpleui_12.getItemoperation();
                          MenuItem _menuitem_2 = _itemoperation_2.getMenuitem();
                          InsertMenuItem _insertmenuitem_1 = _menuitem_2.getInsertmenuitem();
                          String _AlgorithmSimpleUIInsertMenuItem = this.AlgorithmSimpleUIInsertMenuItem(_insertmenuitem_1);
                          String _plus_8 = (command + _AlgorithmSimpleUIInsertMenuItem);
                          String _plus_9 = (_plus_8 + "\n");
                          command = _plus_9;
                        } else {
                          SimpleUI _simpleui_13 = algop.getSimpleui();
                          ItemOperation _itemoperation_3 = _simpleui_13.getItemoperation();
                          MenuItem _menuitem_3 = _itemoperation_3.getMenuitem();
                          RemoveMenuItem _removemenuitem = _menuitem_3.getRemovemenuitem();
                          String _AlgorithmSimpleUIRemoveMenuItem = this.AlgorithmSimpleUIRemoveMenuItem(_removemenuitem);
                          String _plus_10 = (command + _AlgorithmSimpleUIRemoveMenuItem);
                          String _plus_11 = (_plus_10 + "\n");
                          command = _plus_11;
                        }
                      } else {
                        SimpleUI _simpleui_14 = algop.getSimpleui();
                        ItemOperation _itemoperation_4 = _simpleui_14.getItemoperation();
                        ContextItem _contextitem = _itemoperation_4.getContextitem();
                        InsertContextItem _insertcontextitem = _contextitem.getInsertcontextitem();
                        boolean _notEquals_17 = (!Objects.equal(_insertcontextitem, null));
                        if (_notEquals_17) {
                        } else {
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            ModelOperation _modeloperation = algop.getModeloperation();
            boolean _notEquals_18 = (!Objects.equal(_modeloperation, null));
            if (_notEquals_18) {
              ModelOperation _modeloperation_1 = algop.getModeloperation();
              ModelCreate _modelcreate = _modeloperation_1.getModelcreate();
              boolean _notEquals_19 = (!Objects.equal(_modelcreate, null));
              if (_notEquals_19) {
              } else {
                ModelOperation _modeloperation_2 = algop.getModeloperation();
                ModelDelete _modeldelete = _modeloperation_2.getModeldelete();
                boolean _notEquals_20 = (!Objects.equal(_modeldelete, null));
                if (_notEquals_20) {
                } else {
                  ModelOperation _modeloperation_3 = algop.getModeloperation();
                  ModelDiscard _modeldiscard = _modeloperation_3.getModeldiscard();
                  boolean _notEquals_21 = (!Objects.equal(_modeldiscard, null));
                  if (_notEquals_21) {
                  } else {
                    ModelOperation _modeloperation_4 = algop.getModeloperation();
                    ModelIsLoaded _modelisloaded = _modeloperation_4.getModelisloaded();
                    boolean _notEquals_22 = (!Objects.equal(_modelisloaded, null));
                    if (_notEquals_22) {
                    } else {
                      ModelOperation _modeloperation_5 = algop.getModeloperation();
                      ModelLoad _modelload = _modeloperation_5.getModelload();
                      boolean _notEquals_23 = (!Objects.equal(_modelload, null));
                      if (_notEquals_23) {
                      } else {
                      }
                    }
                  }
                }
              }
            } else {
              InstanceOperation _instanceoperation = algop.getInstanceoperation();
              boolean _notEquals_24 = (!Objects.equal(_instanceoperation, null));
              if (_notEquals_24) {
              } else {
                AttributeOperation _attributeoperation = algop.getAttributeoperation();
                AttributeGet _attributeget = _attributeoperation.getAttributeget();
                boolean _notEquals_25 = (!Objects.equal(_attributeget, null));
                if (_notEquals_25) {
                } else {
                }
              }
            }
          }
        }
      }
      return command;
    } catch (final Throwable _t) {
      if (_t instanceof NullPointerException) {
        final NullPointerException e = (NullPointerException)_t;
        return "";
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public Object GenerateSelectionStatement(final SelectionStatement select) {
    return null;
  }
  
  public Object GenerateLoopStatement(final LoopStatement loop) {
    return null;
  }
  
  public Object GenerateWhileLoop(final WhileLoop wloop) {
    return null;
  }
  
  public Object GenerateForLoop(final ForLoop floop) {
    return null;
  }
  
  public Object GenerateVariableStatement(final Variable variable) {
    return null;
  }
  
  public String GenerateAlgorithm(final Algorithm alg) {
    try {
      String _name = alg.getName();
      String _plus = ("# " + _name);
      String algorithm = (_plus + "\n");
      EList<Statement> _stmnt = alg.getStmnt();
      for (final Statement stmnt : _stmnt) {
        AlgorithmOperation _algorithmoperation = stmnt.getAlgorithmoperation();
        boolean _notEquals = (!Objects.equal(_algorithmoperation, null));
        if (_notEquals) {
          AlgorithmOperation _algorithmoperation_1 = stmnt.getAlgorithmoperation();
          String _GenerateAlgorithmOperation = this.GenerateAlgorithmOperation(_algorithmoperation_1);
          String _plus_1 = (algorithm + _GenerateAlgorithmOperation);
          algorithm = _plus_1;
        } else {
          InsertEmbedCode _insertembedcode = stmnt.getInsertembedcode();
          boolean _notEquals_1 = (!Objects.equal(_insertembedcode, null));
          if (_notEquals_1) {
            InsertEmbedCode _insertembedcode_1 = stmnt.getInsertembedcode();
            EmbedCode _codesnippetname = _insertembedcode_1.getCodesnippetname();
            final String code = _codesnippetname.getEmbeddedcode();
            String _plus_2 = (algorithm + code);
            algorithm = _plus_2;
          } else {
          }
        }
      }
      return (algorithm + "\n");
    } catch (final Throwable _t) {
      if (_t instanceof NullPointerException) {
        final NullPointerException e = (NullPointerException)_t;
        return "";
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public Object GenerateEvent() {
    return null;
  }
  
  public CharSequence toALLcode(final Root root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//*****");
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.append("// Generated with MM-DSL compiler for ADOxx 1.3 -- V 1.01");
    _builder.newLine();
    _builder.append("// MM-DSL is designed and developed by Niksa Visic");
    _builder.newLine();
    _builder.append("// Date: ");
    String _GetCurrentDate = this.GetCurrentDate();
    _builder.append(_GetCurrentDate, "");
    _builder.newLineIfNotEmpty();
    _builder.append("//");
    _builder.newLine();
    _builder.append("//*****");
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.append("// The file contains the following libraries:");
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.append("//  ADOxx 1.3 ");
    MethodName _methodname = root.getMethodname();
    String _name = _methodname.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("//  ADOxx 1.3 Dynamic ");
    MethodName _methodname_1 = root.getMethodname();
    String _name_1 = _methodname_1.getName();
    _builder.append(_name_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("//  ADOxx 1.3 Static ");
    MethodName _methodname_2 = root.getMethodname();
    String _name_2 = _methodname_2.getName();
    _builder.append(_name_2, "");
    _builder.newLineIfNotEmpty();
    _builder.append("//");
    _builder.newLine();
    _builder.append("//*****");
    _builder.newLine();
    _builder.newLine();
    _builder.append("VERSION <4.0>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//================================================================================");
    _builder.newLine();
    _builder.append("//================================================================================");
    _builder.newLine();
    _builder.append("APPLICATION LIBRARY <ADOxx 1.3 ");
    MethodName _methodname_3 = root.getMethodname();
    String _name_3 = _methodname_3.getName();
    _builder.append(_name_3, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("//================================================================================");
    _builder.newLine();
    _builder.append("//================================================================================");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//================================================================================");
    _builder.newLine();
    _builder.append("//================================================================================");
    _builder.newLine();
    _builder.append("BUSINESS PROCESS LIBRARY <ADOxx 1.3 Dynamic ");
    MethodName _methodname_4 = root.getMethodname();
    String _name_4 = _methodname_4.getName();
    _builder.append(_name_4, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("//================================================================================");
    _builder.newLine();
    _builder.append("//================================================================================");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Version number>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Date last changed>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"");
    String _GetCurrentDate_1 = this.GetCurrentDate();
    _builder.append(_GetCurrentDate_1, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Last user>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"Admin\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Keywords>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"ADOxx - ");
    MethodName _methodname_5 = root.getMethodname();
    String _name_5 = _methodname_5.getName();
    _builder.append(_name_5, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Comment>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Description>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"This library has been generated with the MM-DSL Compiler\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Modi>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"GENERAL order-of-classes:custom");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("METHOD graphRep:\\\"Method GraphRep\\\" ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("#-----------------------------------------------");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("#");
    MethodName _methodname_6 = root.getMethodname();
    String _name_6 = _methodname_6.getName();
    _builder.append(_name_6, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("#-----------------------------------------------");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("GROUP \\\"");
    MethodName _methodname_7 = root.getMethodname();
    String _name_7 = _methodname_7.getName();
    _builder.append(_name_7, "    ");
    _builder.append(" Model Types\\\"");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("{");
    _builder.newLine();
    {
      Method _method = root.getMethod();
      Metamodel _metamodel = _method.getMetamodel();
      EList<ModelType> _modeltype = _metamodel.getModeltype();
      for(final ModelType m : _modeltype) {
        _builder.append("    \t");
        _builder.append("MODELTYPE \\\"");
        String _name_8 = m.getName();
        _builder.append(_name_8, "    	");
        _builder.append("\\\" ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("#---------------------------------------------------");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("#");
    MethodName _methodname_8 = root.getMethodname();
    String _name_9 = _methodname_8.getName();
    _builder.append(_name_9, "  ");
    _builder.append(" - Model Types");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("#---------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    {
      Method _method_1 = root.getMethod();
      Metamodel _metamodel_1 = _method_1.getMetamodel();
      EList<ModelType> _modeltype_1 = _metamodel_1.getModeltype();
      for(final ModelType modeltype : _modeltype_1) {
        _builder.append("MODELTYPE \\\"");
        String _name_10 = modeltype.getName();
        _builder.append(_name_10, "");
        _builder.append("\\\" from:none plural:\\\"");
        String _name_11 = modeltype.getName();
        _builder.append(_name_11, "");
        _builder.append("\\\" pos:0 not-simulateable ");
        _builder.newLineIfNotEmpty();
        _builder.append("#---Classes:");
        _builder.newLine();
        {
          EList<org.xtext.nv.dsl.mMDSL.Class> _classname = modeltype.getClassname();
          for(final org.xtext.nv.dsl.mMDSL.Class c : _classname) {
            _builder.append("INCL \\\"");
            String _name_12 = c.getName();
            _builder.append(_name_12, "");
            _builder.append("\\\"");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("#---Relation Classes:");
        _builder.newLine();
        {
          EList<Relation> _relationname = modeltype.getRelationname();
          for(final Relation r : _relationname) {
            _builder.append("INCL \\\"");
            String _name_13 = r.getName();
            _builder.append(_name_13, "");
            _builder.append("\\\"");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("#---Modes:");
        _builder.newLine();
        {
          EList<Mode> _modename = modeltype.getModename();
          for(final Mode mod : _modename) {
            _builder.append("MODE \\\"");
            String _name_14 = mod.getName();
            _builder.append(_name_14, "");
            _builder.append("\\\" from:none");
            _builder.newLineIfNotEmpty();
            _builder.append("#---Classes:");
            _builder.newLine();
            {
              EList<org.xtext.nv.dsl.mMDSL.Class> _classname_1 = mod.getClassname();
              for(final org.xtext.nv.dsl.mMDSL.Class c_1 : _classname_1) {
                _builder.append("INCL \\\"");
                String _name_15 = c_1.getName();
                _builder.append(_name_15, "");
                _builder.append("\\\"");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("#---Relation Classes:");
            _builder.newLine();
            {
              EList<Relation> _relationname_1 = mod.getRelationname();
              for(final Relation r_1 : _relationname_1) {
                _builder.append("INCL \\\"");
                String _name_16 = r_1.getName();
                _builder.append(_name_16, "");
                _builder.append("\\\"");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Page layouts>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"LAYOUT \\\"Full page (without header/footer)\\\"");
    _builder.newLine();
    _builder.append("PAGE w:p h:p\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Simmapping>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"SIMOPTION undefined\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Simtext>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"SIMTEXT undefined\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Queries>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Input fields>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <AQL commands>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Result attributes>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Relation analysis>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Service>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <User defined>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"yes\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Library icons>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Evaluation queries>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Evaluation input fields>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Evaluation AQL commands>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Evaluation result attributes>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Sim result mapping>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Numbering>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"numeric\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Graphical representation>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"GRAPHREP");
    _builder.newLine();
    _builder.append("FILL color:aliceblue");
    _builder.newLine();
    _builder.append("RECTANGLE x:-.3cm y:-.3cm w:.6cm h:.6cm");
    _builder.newLine();
    _builder.append("\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Days per year>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE 170");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Hours per day>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE 8");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <CCC mapping>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <CCC default setting>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Object arrangement>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <External coupling>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#INIT GLOBAL VARS");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ON_EVENT \\\"AppInitialized\\\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    {
      Method _method_2 = root.getMethod();
      EList<Algorithm> _algorithm = _method_2.getAlgorithm();
      for(final Algorithm algorithm : _algorithm) {
        _builder.append("\t");
        String _GenerateAlgorithm = this.GenerateAlgorithm(algorithm);
        _builder.append(_GenerateAlgorithm, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Agent definition>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Variable check>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"off\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Configuration of documentation>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Default settings>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"GRID snap:on visible:off w:0.50cm h:0.50cm");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("GRADIENT_PRINTING mode:avg-color\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Predefined queries>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Predefined evaluation queries>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Dynamic evaluation modules>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Path navigator>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Versioning format>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("//================================================================================");
    _builder.newLine();
    _builder.append("CLASS <__LibraryMetaData__> : <__D-construct__>");
    _builder.newLine();
    _builder.append("//================================================================================");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//--- Class <__LibraryMetaData__> - Class attributes------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("CLASSATTRIBUTE <homedir>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("TYPE STRING");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"c:\\\\Program Files (x86)\\\\BOC\\\\ADOxx13_EN_SA\\\\\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("FACET <MultiLineString>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("VALUE 0");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("FACET <AttributeHelpText>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("FACET <AttributeRegularExpression>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("CLASSATTRIBUTE <__ModelListChangeCounter__>");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _typeInt = this.toTypeInt();
    _builder.append(_typeInt, "	");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("CLASSATTRIBUTE <__APListChangeCounter__>");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _typeInt_1 = this.toTypeInt();
    _builder.append(_typeInt_1, "	");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("CLASSATTRIBUTE <ClassAbstract>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE 1");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("CLASSATTRIBUTE <ClassVisible>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE 1");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("CLASSATTRIBUTE <GraphRep>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("CLASSATTRIBUTE <VisibleAttrs>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("CLASSATTRIBUTE <AttrRep>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"NOTEBOOK");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("CHAPTER \\\"Description\\\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTR \\\"Name\\\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("CLASSATTRIBUTE <WF_Trans>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("CLASSATTRIBUTE <AnimRep>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("CLASSATTRIBUTE <HlpTxt>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("CLASSATTRIBUTE <Model pointer>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("CLASSATTRIBUTE <Class cardinality>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("//--- Class <__LibraryMetaData__> - default values--------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Position>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <External tool coupling>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    {
      Method _method_3 = root.getMethod();
      Metamodel _metamodel_2 = _method_3.getMetamodel();
      EList<org.xtext.nv.dsl.mMDSL.Class> _class_ = _metamodel_2.getClass_();
      for(final org.xtext.nv.dsl.mMDSL.Class c_2 : _class_) {
        _builder.append("//================================================================================");
        _builder.newLine();
        _builder.append("CLASS <");
        String _name_17 = c_2.getName();
        _builder.append(_name_17, "");
        _builder.append("> : <");
        {
          org.xtext.nv.dsl.mMDSL.Class _parentclassname = c_2.getParentclassname();
          boolean _notEquals = (!Objects.equal(_parentclassname, null));
          if (_notEquals) {
            org.xtext.nv.dsl.mMDSL.Class _parentclassname_1 = c_2.getParentclassname();
            String _name_18 = _parentclassname_1.getName();
            _builder.append(_name_18, "");
          } else {
            _builder.append("__D-construct__");
          }
        }
        _builder.append(">");
        _builder.newLineIfNotEmpty();
        _builder.append("//================================================================================");
        _builder.newLine();
        _builder.newLine();
        _builder.append("//--- Class <");
        String _name_19 = c_2.getName();
        _builder.append(_name_19, "");
        _builder.append("> - Class attributes------------------------------------------");
        _builder.newLineIfNotEmpty();
        {
          EList<ClassAttribute> _classattribute = c_2.getClassattribute();
          for(final ClassAttribute ca : _classattribute) {
            _builder.append("\t");
            _builder.append("CLASSATTRIBUTE <");
            String _name_20 = ca.getName();
            _builder.append(_name_20, "	");
            _builder.append(">");
            _builder.newLineIfNotEmpty();
            {
              boolean _and = false;
              Type _type = ca.getType();
              SimpleType _simpletype = _type.getSimpletype();
              boolean _equals = Objects.equal(_simpletype, SimpleType.INT);
              if (!_equals) {
                _and = false;
              } else {
                Type _type_1 = ca.getType();
                EnumType _enumtype = _type_1.getEnumtype();
                boolean _equals_1 = Objects.equal(_enumtype, null);
                _and = (_equals && _equals_1);
              }
              if (_and) {
                _builder.append("\t");
                CharSequence _typeInt_2 = this.toTypeInt();
                _builder.append(_typeInt_2, "	");
                _builder.newLineIfNotEmpty();
              } else {
                boolean _and_1 = false;
                Type _type_2 = ca.getType();
                SimpleType _simpletype_1 = _type_2.getSimpletype();
                boolean _equals_2 = Objects.equal(_simpletype_1, SimpleType.STRING);
                if (!_equals_2) {
                  _and_1 = false;
                } else {
                  Type _type_3 = ca.getType();
                  EnumType _enumtype_1 = _type_3.getEnumtype();
                  boolean _equals_3 = Objects.equal(_enumtype_1, null);
                  _and_1 = (_equals_2 && _equals_3);
                }
                if (_and_1) {
                  _builder.append("\t");
                  CharSequence _typeString = this.toTypeString();
                  _builder.append(_typeString, "	");
                  _builder.newLineIfNotEmpty();
                } else {
                  boolean _and_2 = false;
                  Type _type_4 = ca.getType();
                  SimpleType _simpletype_2 = _type_4.getSimpletype();
                  boolean _equals_4 = Objects.equal(_simpletype_2, SimpleType.DOUBLE);
                  if (!_equals_4) {
                    _and_2 = false;
                  } else {
                    Type _type_5 = ca.getType();
                    EnumType _enumtype_2 = _type_5.getEnumtype();
                    boolean _equals_5 = Objects.equal(_enumtype_2, null);
                    _and_2 = (_equals_4 && _equals_5);
                  }
                  if (_and_2) {
                    _builder.append("\t");
                    CharSequence _typeDouble = this.toTypeDouble();
                    _builder.append(_typeDouble, "	");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t");
                    CharSequence _typeEnum = this.toTypeEnum(ca);
                    _builder.append(_typeEnum, "	");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            _builder.append("\t");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("CLASSATTRIBUTE <ClassAbstract>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("VALUE 0");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("CLASSATTRIBUTE <ClassVisible>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("VALUE 1");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("CLASSATTRIBUTE <GraphRep>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("VALUE \"GRAPHREP");
        _builder.newLine();
        {
          SymbolClass _symbolclass = c_2.getSymbolclass();
          boolean _equals_6 = Objects.equal(_symbolclass, null);
          if (_equals_6) {
            _builder.append("\t");
            CharSequence _GenerateRandomClassSymbol = this.GenerateRandomClassSymbol();
            _builder.append(_GenerateRandomClassSymbol, "	");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            String _generateCSymbol = this.generateCSymbol(c_2);
            _builder.append(_generateCSymbol, "	");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\"");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("CLASSATTRIBUTE <VisibleAttrs>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("VALUE \"\"");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("CLASSATTRIBUTE <AttrRep>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("VALUE \"NOTEBOOK");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("CHAPTER \\\"Attributes\\\"");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("ATTR \\\"Name\\\"");
        _builder.newLine();
        _builder.append("\t");
        String _notebook = this.toNotebook(c_2);
        _builder.append(_notebook, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          org.xtext.nv.dsl.mMDSL.Class _parentclassname_2 = c_2.getParentclassname();
          boolean _notEquals_1 = (!Objects.equal(_parentclassname_2, null));
          if (_notEquals_1) {
            org.xtext.nv.dsl.mMDSL.Class _parentclassname_3 = c_2.getParentclassname();
            String _notebook_1 = this.toNotebook(_parentclassname_3);
            _builder.append(_notebook_1, "	");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\"");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("CLASSATTRIBUTE <WF_Trans>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("VALUE \"\"");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("CLASSATTRIBUTE <AnimRep>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("VALUE \"\"");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("CLASSATTRIBUTE <HlpTxt>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("VALUE \"\"");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("CLASSATTRIBUTE <Model pointer>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("VALUE \"\"");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("CLASSATTRIBUTE <Class cardinality>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("VALUE \"\"");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.append("//--- Class <");
        String _name_21 = c_2.getName();
        _builder.append(_name_21, "");
        _builder.append("> - Instance attributes---------------------------------------");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        {
          EList<Attribute> _attribute = c_2.getAttribute();
          for(final Attribute a : _attribute) {
            _builder.append("\t");
            _builder.append("ATTRIBUTE <");
            String _name_22 = a.getName();
            _builder.append(_name_22, "	");
            _builder.append(">");
            _builder.newLineIfNotEmpty();
            {
              boolean _and_3 = false;
              Type _type_6 = a.getType();
              SimpleType _simpletype_3 = _type_6.getSimpletype();
              boolean _equals_7 = Objects.equal(_simpletype_3, SimpleType.INT);
              if (!_equals_7) {
                _and_3 = false;
              } else {
                Type _type_7 = a.getType();
                EnumType _enumtype_3 = _type_7.getEnumtype();
                boolean _equals_8 = Objects.equal(_enumtype_3, null);
                _and_3 = (_equals_7 && _equals_8);
              }
              if (_and_3) {
                _builder.append("\t");
                CharSequence _typeInt_3 = this.toTypeInt();
                _builder.append(_typeInt_3, "	");
                _builder.newLineIfNotEmpty();
              } else {
                boolean _and_4 = false;
                Type _type_8 = a.getType();
                SimpleType _simpletype_4 = _type_8.getSimpletype();
                boolean _equals_9 = Objects.equal(_simpletype_4, SimpleType.STRING);
                if (!_equals_9) {
                  _and_4 = false;
                } else {
                  Type _type_9 = a.getType();
                  EnumType _enumtype_4 = _type_9.getEnumtype();
                  boolean _equals_10 = Objects.equal(_enumtype_4, null);
                  _and_4 = (_equals_9 && _equals_10);
                }
                if (_and_4) {
                  _builder.append("\t");
                  CharSequence _typeString_1 = this.toTypeString();
                  _builder.append(_typeString_1, "	");
                  _builder.newLineIfNotEmpty();
                } else {
                  boolean _and_5 = false;
                  Type _type_10 = a.getType();
                  SimpleType _simpletype_5 = _type_10.getSimpletype();
                  boolean _equals_11 = Objects.equal(_simpletype_5, SimpleType.DOUBLE);
                  if (!_equals_11) {
                    _and_5 = false;
                  } else {
                    Type _type_11 = a.getType();
                    EnumType _enumtype_5 = _type_11.getEnumtype();
                    boolean _equals_12 = Objects.equal(_enumtype_5, null);
                    _and_5 = (_equals_11 && _equals_12);
                  }
                  if (_and_5) {
                    _builder.append("\t");
                    CharSequence _typeDouble_1 = this.toTypeDouble();
                    _builder.append(_typeDouble_1, "	");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t");
                    CharSequence _typeEnum_1 = this.toTypeEnum(a);
                    _builder.append(_typeEnum_1, "	");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
        {
          EList<Reference> _reference = c_2.getReference();
          for(final Reference ref : _reference) {
            _builder.append("\t");
            CharSequence _reference_1 = this.toReference(ref);
            _builder.append(_reference_1, "	");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("//--- Class <");
        String _name_23 = c_2.getName();
        _builder.append(_name_23, "	");
        _builder.append("> - default values--------------------------------------------");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("ATTRIBUTE <Position>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("VALUE \"\"");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("ATTRIBUTE <External tool coupling>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("VALUE \"\"");
        _builder.newLine();
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      Method _method_4 = root.getMethod();
      Metamodel _metamodel_3 = _method_4.getMetamodel();
      EList<Relation> _relation = _metamodel_3.getRelation();
      for(final Relation r_2 : _relation) {
        _builder.append("//================================================================================");
        _builder.newLine();
        _builder.append("RELATIONCLASS <");
        String _name_24 = r_2.getName();
        _builder.append(_name_24, "");
        _builder.append(">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("FROM <");
        org.xtext.nv.dsl.mMDSL.Class _fromclassname = r_2.getFromclassname();
        String _name_25 = _fromclassname.getName();
        _builder.append(_name_25, "	");
        _builder.append(">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("TO <");
        org.xtext.nv.dsl.mMDSL.Class _toclassname = r_2.getToclassname();
        String _name_26 = _toclassname.getName();
        _builder.append(_name_26, "	");
        _builder.append(">");
        _builder.newLineIfNotEmpty();
        _builder.append("//================================================================================");
        _builder.newLine();
        _builder.newLine();
        _builder.append("//--- Relationclass <");
        String _name_27 = r_2.getName();
        _builder.append(_name_27, "");
        _builder.append("> - Instance attributes----------------------------------");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("ATTRIBUTE <Positions>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("TYPE STRING");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("VALUE \"\"");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("FACET <MultiLineString>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("VALUE 0");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("FACET <AttributeHelpText>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("VALUE \"\"");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("FACET <AttributeRegularExpression>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("VALUE \"\"");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("ATTRIBUTE <GraphRep>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("TYPE STRING");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("VALUE \"GRAPHREP");
        _builder.newLine();
        {
          SymbolRelation _symbolrelation = r_2.getSymbolrelation();
          boolean _equals_13 = Objects.equal(_symbolrelation, null);
          if (_equals_13) {
            _builder.append("\t");
            CharSequence _GenerateRandomRelationSymobl = this.GenerateRandomRelationSymobl();
            _builder.append(_GenerateRandomRelationSymobl, "	");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            String _generateRSymobl = this.generateRSymobl(r_2);
            _builder.append(_generateRSymobl, "	");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\"");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("FACET <MultiLineString>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("VALUE 0");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("FACET <AttributeHelpText>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("VALUE \"\"");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("FACET <AttributeRegularExpression>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("VALUE \"\"");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("ATTRIBUTE <AttrRep>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("TYPE STRING");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("VALUE \"NOTEBOOK");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("CHAPTER \\\"Attributes\\\"");
        _builder.newLine();
        _builder.append("\t");
        String _notebook_2 = this.toNotebook(r_2);
        _builder.append(_notebook_2, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\"");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("FACET <MultiLineString>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("VALUE 0");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("FACET <AttributeHelpText>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("VALUE \"\"");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("FACET <AttributeRegularExpression>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("VALUE \"\"");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        {
          EList<Attribute> _attribute_1 = r_2.getAttribute();
          for(final Attribute a_1 : _attribute_1) {
            _builder.append("\t");
            _builder.append("ATTRIBUTE <");
            String _name_28 = a_1.getName();
            _builder.append(_name_28, "	");
            _builder.append(">");
            _builder.newLineIfNotEmpty();
            {
              boolean _and_6 = false;
              Type _type_12 = a_1.getType();
              SimpleType _simpletype_6 = _type_12.getSimpletype();
              boolean _equals_14 = Objects.equal(_simpletype_6, SimpleType.INT);
              if (!_equals_14) {
                _and_6 = false;
              } else {
                Type _type_13 = a_1.getType();
                EnumType _enumtype_6 = _type_13.getEnumtype();
                boolean _equals_15 = Objects.equal(_enumtype_6, null);
                _and_6 = (_equals_14 && _equals_15);
              }
              if (_and_6) {
                _builder.append("\t");
                CharSequence _typeInt_4 = this.toTypeInt();
                _builder.append(_typeInt_4, "	");
                _builder.newLineIfNotEmpty();
              } else {
                boolean _and_7 = false;
                Type _type_14 = a_1.getType();
                SimpleType _simpletype_7 = _type_14.getSimpletype();
                boolean _equals_16 = Objects.equal(_simpletype_7, SimpleType.STRING);
                if (!_equals_16) {
                  _and_7 = false;
                } else {
                  Type _type_15 = a_1.getType();
                  EnumType _enumtype_7 = _type_15.getEnumtype();
                  boolean _equals_17 = Objects.equal(_enumtype_7, null);
                  _and_7 = (_equals_16 && _equals_17);
                }
                if (_and_7) {
                  _builder.append("\t");
                  CharSequence _typeString_2 = this.toTypeString();
                  _builder.append(_typeString_2, "	");
                  _builder.newLineIfNotEmpty();
                } else {
                  boolean _and_8 = false;
                  Type _type_16 = a_1.getType();
                  SimpleType _simpletype_8 = _type_16.getSimpletype();
                  boolean _equals_18 = Objects.equal(_simpletype_8, SimpleType.DOUBLE);
                  if (!_equals_18) {
                    _and_8 = false;
                  } else {
                    Type _type_17 = a_1.getType();
                    EnumType _enumtype_8 = _type_17.getEnumtype();
                    boolean _equals_19 = Objects.equal(_enumtype_8, null);
                    _and_8 = (_equals_18 && _equals_19);
                  }
                  if (_and_8) {
                    _builder.append("\t");
                    CharSequence _typeDouble_2 = this.toTypeDouble();
                    _builder.append(_typeDouble_2, "	");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t");
                    CharSequence _typeEnum_2 = this.toTypeEnum(a_1);
                    _builder.append(_typeEnum_2, "	");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            _builder.append("\t");
            _builder.newLine();
          }
        }
        _builder.newLine();
      }
    }
    _builder.append("//================================================================================");
    _builder.newLine();
    _builder.append("//================================================================================");
    _builder.newLine();
    _builder.append("WORKING ENVIRONMENT LIBRARY <ADOxx 1.3 Static ");
    MethodName _methodname_9 = root.getMethodname();
    String _name_29 = _methodname_9.getName();
    _builder.append(_name_29, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("//================================================================================");
    _builder.newLine();
    _builder.append("//================================================================================");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Version number>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Date last changed>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"12.02.2013, 09:51\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Last user>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"Admin\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Keywords>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Comment>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Description>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Modi>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \" \"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Page layouts>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Simmapping>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Simtext>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Queries>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Input fields>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <AQL commands>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Result attributes>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Relation analysis>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Service>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <User defined>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"yes\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Library icons>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Evaluation queries>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Evaluation input fields>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Evaluation AQL commands>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Evaluation result attributes>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Sim result mapping>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Numbering>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"numeric\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Graphical representation>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Days per year>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE 0");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Hours per day>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE 0");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <CCC mapping>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <CCC default setting>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Object arrangement>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <External coupling>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Agent definition>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Variable check>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"on\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Configuration of documentation>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Default settings>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Predefined queries>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Predefined evaluation queries>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Dynamic evaluation modules>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Path navigator>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTRIBUTE <Versioning format>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("VALUE \"\"");
    _builder.newLine();
    return _builder;
  }
}
