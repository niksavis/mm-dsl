/*******************************************************************************
 * Copyright (c) 2015 Niksa Visic.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.xtext.nv.dsl.generator

// java, xtext, xbase, xtend stuff
import com.google.inject.Inject
import java.util.Date
import java.util.Random
import java.util.Collections
import java.util.ArrayList
import java.text.SimpleDateFormat
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.ImportManager
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable
import org.eclipse.xtext.xbase.compiler.XbaseCompiler

// MM-DSL stuff
import org.xtext.nv.dsl.mMDSL.Root
import org.xtext.nv.dsl.mMDSL.MethodName
import org.xtext.nv.dsl.mMDSL.IncludeLibrary
import org.xtext.nv.dsl.mMDSL.Metamodel
import org.xtext.nv.dsl.mMDSL.Class
import org.xtext.nv.dsl.mMDSL.Relation
import org.xtext.nv.dsl.mMDSL.Attribute
import org.xtext.nv.dsl.mMDSL.Reference
import org.xtext.nv.dsl.mMDSL.ClassAttribute
import org.xtext.nv.dsl.mMDSL.ModelType
import org.xtext.nv.dsl.mMDSL.Mode
import org.xtext.nv.dsl.mMDSL.Type
import org.xtext.nv.dsl.mMDSL.EnumType
import org.xtext.nv.dsl.mMDSL.AccessType
import org.xtext.nv.dsl.mMDSL.Enumeration
import org.xtext.nv.dsl.mMDSL.SimpleType
import org.xtext.nv.dsl.mMDSL.SymbolClass
import org.xtext.nv.dsl.mMDSL.SymbolRelation
import org.xtext.nv.dsl.mMDSL.SymbolStyle
import org.xtext.nv.dsl.mMDSL.SVGCommand
import org.xtext.nv.dsl.mMDSL.EmbedCode
import org.xtext.nv.dsl.mMDSL.InfoBox
import org.xtext.nv.dsl.mMDSL.InsertMenuItem
import org.xtext.nv.dsl.mMDSL.Algorithm
import org.xtext.nv.dsl.mMDSL.AlgorithmOperation
import org.xtext.nv.dsl.mMDSL.FileOperation
import org.xtext.nv.dsl.mMDSL.ErrorBox
import org.xtext.nv.dsl.mMDSL.WarningBox
import org.xtext.nv.dsl.mMDSL.ViewBox
import org.xtext.nv.dsl.mMDSL.RemoveMenuItem
import org.xtext.nv.dsl.mMDSL.Statement
import org.xtext.nv.dsl.mMDSL.AlgorithmOperation
import org.xtext.nv.dsl.mMDSL.SelectionStatement
import org.xtext.nv.dsl.mMDSL.LoopStatement
import org.xtext.nv.dsl.mMDSL.WhileLoop
import org.xtext.nv.dsl.mMDSL.ForLoop
import org.xtext.nv.dsl.mMDSL.Variable
import org.xtext.nv.dsl.mMDSL.FileCopy
import org.xtext.nv.dsl.mMDSL.FileDelete
import org.xtext.nv.dsl.mMDSL.FileCreate
import org.xtext.nv.dsl.mMDSL.FileRead
import org.xtext.nv.dsl.mMDSL.FileWrite
import org.xtext.nv.dsl.mMDSL.DirSetWorking
import org.xtext.nv.dsl.mMDSL.DirGetWorking
import org.xtext.nv.dsl.mMDSL.DirCreate
import org.xtext.nv.dsl.mMDSL.DirDelete
import org.xtext.nv.dsl.mMDSL.DirList
import org.xtext.nv.dsl.mMDSL.ModelCreate
import org.xtext.nv.dsl.mMDSL.ModelDelete
import org.xtext.nv.dsl.mMDSL.ModelDiscard
import org.xtext.nv.dsl.mMDSL.ModelSave
import org.xtext.nv.dsl.mMDSL.ModelLoad
import org.xtext.nv.dsl.mMDSL.ModelIsLoaded
import org.xtext.nv.dsl.mMDSL.ClassInstanceCreate
import org.xtext.nv.dsl.mMDSL.ClassInstanceDelete
import org.xtext.nv.dsl.mMDSL.ClassInstanceGet
import org.xtext.nv.dsl.mMDSL.ClassInstanceGetAll
import org.xtext.nv.dsl.mMDSL.ClassInstanceSet
import org.xtext.nv.dsl.mMDSL.RelationInstanceCreate
import org.xtext.nv.dsl.mMDSL.RelationInstanceDelete
import org.xtext.nv.dsl.mMDSL.RelationInstanceGet
import org.xtext.nv.dsl.mMDSL.RelationInstanceGetAll
import org.xtext.nv.dsl.mMDSL.RelationInstanceSet
import org.xtext.nv.dsl.mMDSL.AttributeGet
import org.xtext.nv.dsl.mMDSL.AttributeSet

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class MMDSLGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile
		(resource.className+'_output.all', toALLcode(resource.contents.head as Root))
		}

	def className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.'))
	}
 
	def toEnumValuesCode(EList<String> enumvalues) '''
		«FOR String v: enumvalues»«IF enumvalues.lastIndexOf(v) == enumvalues.size - 1»«v»«ELSE»«v»@«ENDIF»«ENDFOR»'''
		
	def toTypeInt()'''
	TYPE INTEGER
	VALUE 0

		FACET <MultiLineString>
		VALUE 0

		FACET <AttributeHelpText>
		VALUE ""

		FACET <AttributeRegularExpression>
		VALUE ""

		FACET <AttributeNumericDomain>
		VALUE ""
		
	'''
	
	def toTypeDouble()'''
	TYPE DOUBLE
	VALUE 0

		FACET <MultiLineString>
		VALUE 0

		FACET <AttributeHelpText>
		VALUE ""

		FACET <AttributeRegularExpression>
		VALUE ""

		FACET <AttributeNumericDomain>
		VALUE ""
		
	'''
	
	def toTypeString()'''
	TYPE STRING
	VALUE ""

		FACET <MultiLineString>
		VALUE 0

		FACET <AttributeHelpText>
		VALUE ""

		FACET <AttributeRegularExpression>
		VALUE ""
		
	'''
	def toTypeEnum(ClassAttribute ca)'''
	TYPE ENUMERATION

		FACET <EnumerationDomain>
		VALUE "«ca.type.enumtype.name.enumvalues.toEnumValuesCode»"

		FACET <MultiLineString>
		VALUE 0

		FACET <AttributeHelpText>
		VALUE ""

		FACET <AttributeRegularExpression>
		VALUE ""

	CLASSATTRIBUTE <«ca.name»>
	VALUE "«ca.type.enumtype.name.enumvalues.get(0)»"
	
	'''
	
	def toTypeEnum(Attribute a)'''
	TYPE ENUMERATION

		FACET <EnumerationDomain>
		VALUE "«a.type.enumtype.name.enumvalues.toEnumValuesCode»"

		FACET <MultiLineString>
		VALUE 0

		FACET <AttributeHelpText>
		VALUE ""

		FACET <AttributeRegularExpression>
		VALUE ""

	ATTRIBUTE <«a.name»>
	VALUE "«a.type.enumtype.name.enumvalues.get(0)»"
	'''
		
	def toReference(Reference ref) '''
	ATTRIBUTE <«ref.name»>
	TYPE INTERREF

		FACET <MultiLineString>
		VALUE 0

		FACET <AttributeHelpText>
		VALUE ""

		FACET <AttributeRegularExpression>
		VALUE ""

		FACET <AttributeInterRefDomain>
		VALUE "REFDOMAIN
		«IF ref.refname.classname == null»MODREF
		mt:\"«ref.refname.modeltypename.name»\"
		«ELSE»OBJREF
		mt:\"«ref.refname.modeltypename.name»\"
		c:\"«ref.refname.classname.name»\"
		«ENDIF»"

	ATTRIBUTE <«ref.name»>
	VALUE ""
	'''
		
	def toNotebook(Class c) {
		var notebook = '' // empty notebook has a name attribute per default
		if(c.attribute.empty && c.reference.empty) {
			// if no attributes and references are contained in a class, return empty notebook
			return notebook 
		}
		//create attribute notebooks
		if(!c.attribute.empty)
		{
			for(i : 0 .. c.attribute.size-1)
			{	// go through attributes of a class
				var attr = c.attribute.get(i) // get current attribute
				if(attr.access == AccessType::WRITE) {
					// if access type is "write"
					notebook = notebook + 'ATTR ' + '\\"' + attr.name + '\\"' + '\n'
				}
				else if(attr.access == AccessType::READ) {
					// if access type is "read"
					notebook = notebook + 'ATTR ' + '\\"' + attr.name + '\\"' + ' write-protected' + '\n'
				}
				else {
					// if access type is "internal"
					notebook = notebook + '#' + 'ATTR ' + '\\"' + attr.name + '\\"' + '\n'
				}
			}
		}		
		//create reference notebooks
		if(!c.reference.empty)
		{
			for(i : 0 .. c.reference.size-1)
			{
				var ref = c.reference.get(i) // get current reference
				notebook = notebook + 'ATTR ' + '\\"' + ref.name + '\\"' + '\n'
			}
		}		
		// return notebook with default attribute values (0 if int, "" if string)
		// and references
		return notebook
	}
	/* 
	 * example: toNotebook(Car)
	 * Car.attribute will contain: Name (per default), color, length, width, height, weight
	 * attribute.access will be WRITE (all attributes are visible and values can be changed)
	 */
	
	def toNotebook(Relation r) {
		var notebook = ''
		if(r.attribute.empty)
		{
			return notebook
		}
		for(i : 0 .. r.attribute.size-1)
		{
			var attr = r.attribute.get(i)
			if(attr.access == AccessType::WRITE)
			{
				notebook = notebook + 'ATTR ' + '\\"' + attr.name + '\\"' + '\n'
			}
			else if(attr.access == AccessType::READ)
			{
				notebook = notebook + 'ATTR ' + '\\"' + attr.name + '\\"' + ' write-protected' + '\n'
			}
			else
			{
				notebook = notebook + '#' + 'ATTR ' + '\\"' + attr.name + '\\"' + '\n'
			}
		}
		
		return notebook
	}
	
	def RngColor(){		
		var rand = new Random()
		var colors = new ArrayList<String>()
		colors.addAll(
			"red",			//0 
			"blue", 		//1
			"green",		//2 
			"yellow", 		//3
			"pink", 		//4
			"orange", 		//5
			"silver", 		//6
			"black", 		//7
			"azure", 		//8
			"aqua", 		//9
			"coral",		//10
			"aqua",			//11
			"brown",		//12
			"gold",			//13
			"gray",			//14
			"navy",			//15
			"violet",		//16
			"darkblue",		//17
			"blueviolet",	//18
			"crimson"		//19
			)
		var colornum = rand.nextInt(19)
		return colors.get(colornum)
	}
	
	def RngRectangle(){
		var rand = new Random()
		var rectsize = rand.nextInt(40) +  11
		var rectangle = "RECTANGLE x:-" + rectsize/2 + "pt y:-" + rectsize/2 + "pt h:" + rectsize + "pt w:" + rectsize + "pt"
		var name = "ATTR \\\"Name\\\" x:0pt y:" + (rectsize/2+1) + "pt w:c" // \ needs to be included
		var command = rectangle + "\n" + name
		return command
	}
	
	def RngEllipse() {
		var rand = new Random()
		var ellsizex = rand.nextInt(40) + 11
		var ellsizey = rand.nextInt(40) + 11
		var ellipse = "ELLIPSE x:0pt y:0pt rx:" + ellsizex + "pt ry:" + ellsizey + "pt"
		var name = "ATTR \\\"Name\\\" x:0pt y:" + (ellsizey+1) + "pt w:c" // \ needs to be included
		var command = ellipse + "\n" + name
		return command
	}
	
	// random symbol pool
	def RngSymbol(){
		var rand = new Random()
		var select = rand.nextInt(2) // 0 or 1
		switch select {
			case 0 : RngEllipse()
			default: RngRectangle()
		} 
	}
	
	// generate random class symbol
	def GenerateRandomClassSymbol()'''
	PEN color:«RngColor» w:2pt
	FILL color:«RngColor»
	«RngSymbol»'''
	
	// generate random relation symbol
	def GenerateRandomRelationSymobl()'''
	PEN color:black w:1pt
	FILL color:«RngColor»
	START
	#none
	MIDDLE
	#normal line
	END
	POLYGON 3 x1:-5pt y1:3pt x2:0pt y2:0pt x3:-5pt y3:-3pt
	'''
	// inserting embedded code
	def InsertCodeSnippet(EmbedCode ec){
		return ec.embeddedcode
	}
	
	def toGraphRepCoordinate(int svgx) {
		
		//only works for rectangles!
		return (- svgx / 2)	
	}
	
	def defaultStyle(){
		var pen = 'PEN color:black w:1pt\n'
		var fill = 'FILL color:black\n'
		return pen + fill
	}
	
	def applyStyle(SymbolStyle ss) {
		var command = ''
		// style not associated or does not exist
		if(ss == null)
		{
			return command
		}
		if(ss.strokecolor.hexcolor != null)
		{
			command = 'PEN color:' + command + ss.strokecolor.hexcolor.toGraphRepColor
		}
		else
		{
			command = 'PEN color:' + command + ss.strokecolor.color
		}
		command = command + ' w:' + ss.strokewidth + 'pt' + '\n'
		command = command + 'FILL color:'
		if(ss.fillcolor.hexcolor != null)
		{
			command = command + ss.fillcolor.hexcolor.toGraphRepColor
		}
		else
		{
			command = command + ss.fillcolor.color +'\n'
		}
		return command
	}
	
	def generateCSymbol(Class c) {		
		var command =''
		for(SVGCommand svgc: c.symbolclass.svgcommand)
		{
			if(svgc.symbolstyle != null)
			{
				command = command + applyStyle(svgc.symbolstyle)
			}
			else if(svgc.symbolstyleref != null)
			{
				command = command + applyStyle(svgc.symbolstyleref)
			}
			else
			{
				if(c.symbolclass.globalstyle != null)
				{
					command = command + applyStyle(c.symbolclass.globalstyle)
				}
				else
				{
					command = command + defaultStyle()
				}	
			}
			command = command + toGraphRepCommand(svgc)
		}
		return command
	}	
	
	def generateRSymobl(Relation r) {		
		var command = 'START\n'		
		for(SVGCommand svgcfrom: r.symbolrelation.svgcommandsfrom)
		{
			if(svgcfrom.symbolstyle != null)
			{
				command = command + applyStyle(svgcfrom.symbolstyle)
			}
			else if(svgcfrom.symbolstyleref != null)
			{
				command = command + applyStyle(svgcfrom.symbolstyleref)
			}
			else
			{
				if(r.symbolrelation.globalstyle != null)
				{
					command = command + applyStyle(r.symbolrelation.globalstyle)
				}
				else
				{
					command = command + defaultStyle()
				}
			}
			command = command + toGraphRepCommand(svgcfrom)
		}		
		command = command + 'MIDDLE\n'
		for(SVGCommand svgcline: r.symbolrelation.svgcommandsmiddle)
		{
			if(svgcline.symbolstyle != null)
			{
				command = command + applyStyle(svgcline.symbolstyle)
			}
			else if(svgcline.symbolstyleref != null)
			{
				command = command + applyStyle(svgcline.symbolstyleref)
			}
			else
			{
				if(r.symbolrelation.globalstyle != null)
				{
					command = command + applyStyle(r.symbolrelation.globalstyle)
				}
				else
				{
					command = command + defaultStyle()
				}
			}
			command = command + toGraphRepCommand(svgcline)
		}
		command = command + 'END\n'
		for(SVGCommand svgcto: r.symbolrelation.svgcommandsto)
		{
			if(svgcto.symbolstyle != null)
			{
				command = command + applyStyle(svgcto.symbolstyle)
			}
			else if(svgcto.symbolstyleref != null)
			{
				command = command + applyStyle(svgcto.symbolstyleref)
			}
			else
			{
				if(r.symbolrelation.globalstyle != null)
				{
					command = command + applyStyle(r.symbolrelation.globalstyle)
				}
				else
				{
					command = command + defaultStyle()
				}
			}
			command = command + toGraphRepCommand(svgcto)
		}		
		return command
	}
		
	def toGraphRepColor(String hex) {
		return '$' + hex.substring(1,7)
	}
		
	def toGraphRepCommand(SVGCommand svg) {	
		var command = ''
		//command does not exist
		if(svg == null)
		{
			return command
		}
		if(svg.rectangle != null)
		{
			val r = svg.rectangle
			command = 'RECTANGLE' + 
				' x:' + r.x + 'pt' +
				' y:' + r.y + 'pt' +
				' h:' + r.width + 'pt' +
				' w:' + r.height + 'pt'
		}
		else if(svg.circle != null)
		{
			val c = svg.circle
			command = 'ELLIPSE' +
			' x:' + c.cx + 'pt' +
			' y:' + c.cy + 'pt' +
			' rx:' + c.r + 'pt' +
			' ry:' + c.r + 'pt'	
		}
		else if(svg.ellipse != null)
		{
			val e = svg.ellipse
			command = 'ELLIPSE' +
			' x:' + e.cx + 'pt' +
			' y:' + e.cy + 'pt' +
			' rx:' + e.rx + 'pt' +
			' ry:' + e.ry + 'pt'	
		}
		else if(svg.line != null)
		{
			val l = svg.line
			command = 'LINE' +
			' x1:' + l.x1 + 'pt' +
			' y1:' + l.y1 + 'pt' +
			' x2:' + l.x2 + 'pt' +
			' y2:' + l.y2 + 'pt'
		}
		else if(svg.polyline != null)
		{
			val pl = svg.polyline
			command = 'POLYLINE ' + pl.points.size
			
			for(i : 0 ..< pl.points.size)
			{
				var point = pl.points.get(i)
				var p = i + 1
				command = command + ' x' + p + ':' + point.x +'pt' + ' y' + p + ':' + point.y + 'pt'
			}
		}
		else if(svg.polygon != null)
		{
			val po = svg.polygon
			command = 'POLYGON ' + po.points.size
			
			for(i : 0 ..< po.points.size)
			{
				var point = po.points.get(i)
				var p = i + 1
				command = command + ' x' + p + ':' + point.x +'pt' + ' y' + p + ':' + point.y + 'pt'				
			}
		}
		else if(svg.path != null)
		{
			// not supported
		}
		else if(svg.text != null)
		{
			val t = svg.text
			command = 'TEXT ' +
				'\\"' + t.value + '\\"' +
				' x:' + t.x + 'pt' +
				' y:' + t.y + 'pt'				
		}
		else // if(svg.insertembedcode != null)
		{
			val code = svg.insertembedcode.codesnippetname.embeddedcode
			command = code		
		}
		return command + '\n'
	}
	
	def GetCurrentDate(){
		var sdfDate = new SimpleDateFormat('dd.MM.yyyy, HH:mm')
		return sdfDate.format(new Date())
	}
	
	// SimpleUI algorithms
	def AlgorithmSimpleUIInfoBox(InfoBox infobox){
		var command = "CC \\\"AdoScript\\\" INFOBOX \\\"" + infobox.text + "\\\" title:\\\"" + infobox.title + "\\\""
		return command	
	}
	
	def AlgorithmSimpleUIErrorBox(ErrorBox errorbox){
		var command = "CC \\\"AdoScript\\\" ERRORBOX \\\"" + errorbox.text + "\\\" title:\\\"" + errorbox.title + "\\\""
		command = command + " " + errorbox.buttontype
		return command
	}
	
	def AlgorithmSimpleUIWarningBox(WarningBox warningbox){
		var command = "CC \\\"AdoScript\\\" WARNINGBOX \\\"" + warningbox.text + "\\\" title:\\\"" + warningbox.title + "\\\""
		command = command + " " + warningbox.buttontype
		return command
	}
	
	def AlgorithmSimpleUIViewBox(ViewBox viewbox){
		var command = "CC \\\"AdoScript\\\" VIEWBOX \\\"" + viewbox.text + "\\\" title:\\\"" + viewbox.title + "\\\""
		return command
	}
	
	def AlgorithmSimpleUIInsertMenuItem(InsertMenuItem insertmenuitem){
		var command = "ITEM \\\"" + insertmenuitem.name + "\\\" modeling:\\\"" + insertmenuitem.menu + "\\\""
		return command 
	}
	
	def AlgorithmSimpleUIRemoveMenuItem(RemoveMenuItem removemenuitem){
		var command = "CC \\\"Application\\\" REMOVE_MENU_ITEM \\\" component:\\\"modeling\\\" \\\"" + removemenuitem.menuitemname + "\\\""
		return command
	}
	
	// FileOperation algorithms
	def AlgorithmFileCopy(FileCopy filecopy){
		// CC "AdoScript" COPY_FILES "db:\\calcPowerAvg.r" to: (c_sActiveFolder + "calcPowerAvg.r") overwrite-existing
		var command = "CC \\\"AdoScript\\\" COPY_FILES \\\"" + filecopy.src + "\\\" to:\\\"" + filecopy.dest + "\\\""
		return command
	}
	
	def AlgorithmFileDelete(FileDelete filedelete){
		var command = "CC \\\"AdoScript\\\" FILE_DELETE file: \\\"" + filedelete.filename + "\\\""
		// --> RESULT ecode: intValue 
		return command
	}
	
	def AlgorithmFileCreate(FileCreate filecreate){
		var command = ""
		return command
	}
	
	def AlgorithmFileRead(FileRead fileread){
		var command = "CC \\\"AdoScript\\\" FREAD file: \\\"" + fileread.filename + "\\\""
		// --> RESULT ecode: intValue text: strValue 
		return command
	}
	
	def AlgorithmFileWrite(FileWrite filewrite){
		//CC "AdoScript" FWRITE file: (sConsumptionDataFile) text: (sExportString + "\n") append: 0 binary: 0 base64: 0
		var command = "CC \\\"AdoScript\\\" FWRITE file: \\\"" + filewrite.filename + "\\\" text: \\\"" + filewrite.text + "\\\""
		if(filewrite.append != null){
			command = command + " append:1"
		}
		//--> RESULT ecode: intValue		
		return command 
	}
	
	// DirOperation algorithms
	def AlgorithmDirSetWorking(DirSetWorking setworking){
		
	}
	
	def AlgorithmDirGetWorking(DirGetWorking getworking){
		
	}
	
	def AlgorithmDirCreate(DirCreate dircreate){
		var command = "CC \\\"AdoScript\\\" DIR_CREATE path: \\\"" + dircreate.dirname + "\\\""
		return command
	}
	
	def AlgorithmDirDelete(DirDelete dirdelete){
		
	}
	
	def AlgorithmDirList(DirList dirlist){
		var command = "CC \\\"AdoScript\\\" DIR_LIST path: \\\"" + dirlist.dirname + "\\\""
		// --> RESULT ecode: intValue files: strValue dirs: strValue
		return command
	}
	
	// ModelOperation algorithms
	def AlgorithmModelCreate(ModelCreate modelcreate){
		
	}
	
	def AlgorithmModelDelete(ModelDelete modeldelete){
		
	}
	
	def AlgorithmModelDiscard(ModelDiscard modeldiscard){
		
	}
	
	def AlgorithmModelSave(ModelSave modelsave){
		
	}
	
	def AlgorithmModelLoad(ModelLoad modelload){
		
	}
	
	def AlgorithmModelIsLoaded(ModelIsLoaded modelisloaded){
		
	}
	
	// InstanceOperation algorithms
	def AlgorithmInstanceClassCreate(ClassInstanceCreate cicreate){
		
	}
	
	def AlgorithmInstanceClassDelete(ClassInstanceDelete cidelete){
		
	}
	
	def AlgorithmInstanceClassGet(ClassInstanceGet ciget){
		
	}
	
	def AlgorithmInstanceClassGetAll(ClassInstanceGetAll cigetall){
		
	}
	
	def AlgorithmInstanceClassSet(ClassInstanceSet ciset){
		
	}
	
	def AlgorithmInstanceRelationCreate(RelationInstanceCreate ricreate){
		
	}
	
	def AlgorithmInstanceRelationDelete(RelationInstanceDelete ridelete){
		
	}
	
	def AlgorithmInstanceRelationGet(RelationInstanceGet riget){
		
	}
	
	def AlgorithmInstanceRelationGetAll(RelationInstanceGetAll rigetall){
		
	}
	
	def AlgorithmInstanceRelationSet(RelationInstanceSet riset){
		
	}
	
	// AttributeOperation algorithms
	def AlgorithmAttributeGet(AttributeGet aget){
		
	}
	
	def AlgorithmAttributeSet(AttributeSet aset){
		
	}  
	
	def GenerateAlgorithmOperation(AlgorithmOperation algop){
		try{
			var command = ""
			if(algop.fileoperation != null){
				if(algop.fileoperation.filecopy != null){
					
				}
				else if(algop.fileoperation.filecreate != null){
					
				}
				else if(algop.fileoperation.filedelete != null){
					
				}
				else if(algop.fileoperation.fileread != null){
					
				}
				else{ //(algop.fileoperation.filewrite != null){
					
				}
			}
			else if(algop.diroperation != null){
				if(algop.diroperation.dircreate != null){
					
				}
				else if(algop.diroperation.dirdelete != null){
					
				}
				else if(algop.diroperation.dirlist != null){
					
				}
				else{ //(algop.diroperation.dirsetworking != null){
					
				}
			}
			else if(algop.simpleui != null){
				if(algop.simpleui.editbox != null){
					
				}
				else if(algop.simpleui.infobox != null){
					command = command + AlgorithmSimpleUIInfoBox(algop.simpleui.infobox) + "\n"
				}
				else if(algop.simpleui.errorbox != null){
					command = command + AlgorithmSimpleUIErrorBox(algop.simpleui.errorbox) + "\n"
				}
				else if(algop.simpleui.warningbox != null){
					command = command + AlgorithmSimpleUIWarningBox(algop.simpleui.warningbox) + "\n"
				}
				else if(algop.simpleui.viewbox != null){
					command = command + AlgorithmSimpleUIViewBox(algop.simpleui.viewbox) + "\n"
				}
				else{ //if(algop.simpleui.itemoperation != null){
					if(algop.simpleui.itemoperation.menuitem != null){
						if(algop.simpleui.itemoperation.menuitem.insertmenuitem != null){
							command = command + AlgorithmSimpleUIInsertMenuItem(algop.simpleui.itemoperation.menuitem.insertmenuitem) + "\n"
						}
						else{ //if(algop.simpleui.itemoperation.menuitem.removemenuitem != null){
							command = command + AlgorithmSimpleUIRemoveMenuItem(algop.simpleui.itemoperation.menuitem.removemenuitem) + "\n"
						}
					}
					else{ //if(algop.simpleui.itemoperation.contextitem != null){
						if(algop.simpleui.itemoperation.contextitem.insertcontextitem != null){
							
						}
						else{ //if(algop.simpleui.itemoperation.contextitem.removecontextitem != null){
							
						}
					}
				}
			}
			else if(algop.modeloperation != null){
				if(algop.modeloperation.modelcreate != null){
					
				}
				else if(algop.modeloperation.modeldelete != null){
					
				}
				else if(algop.modeloperation.modeldiscard != null){
					
				}
				else if(algop.modeloperation.modelisloaded != null){
					
				}
				else if(algop.modeloperation.modelload != null){
					
				}
				else{ //if(algop.modeloperation.modelsave != null){
					
				}
			}
			else if(algop.instanceoperation != null){
//				if(algop.instanceoperation.classinstance != null){
//					
//				}
//				else if(algop.instanceoperation.relationinstance != null){
//					
//				}
//				else if(algop.instanceoperation.deleteinstance != null){
//					
//				}
//				else{ //if(algop.instanceoperation.getinstencelist != null){
//					
//				}
			}
			else{ //if (algop.attributeoperation != null){
				if(algop.attributeoperation.attributeget != null){
					
				}
				else{ //if(algop.attributeoperation.attributeset != null){
					
				}
			}
		return command
		}
		catch(NullPointerException e){
			return ""
		}
	}
	
	// generates selection statement (if-elseif-else)
	def GenerateSelectionStatement(SelectionStatement select){
		
	}
	
	// generate loop statement (while, for)
	def GenerateLoopStatement(LoopStatement loop){
		
	}
	
	// generates while loop
	def GenerateWhileLoop(WhileLoop wloop){
		
	}
	
	// generates for loop
	def GenerateForLoop(ForLoop floop){
		
	}
	
	// generates variable statement
	def GenerateVariableStatement(Variable variable){
		
	}
	
	// generates algorithms
	def GenerateAlgorithm(Algorithm alg){
		try{
			var algorithm = "# " + alg.name + "\n"
			for(Statement stmnt: alg.stmnt){
				if(stmnt.algorithmoperation != null){
					algorithm = algorithm + GenerateAlgorithmOperation(stmnt.algorithmoperation)
				}
				else if(stmnt.insertembedcode != null)
				{
					val code = stmnt.insertembedcode.codesnippetname.embeddedcode	
					algorithm = algorithm + code
				}
				else
				{
					// error
				}
			}
			//TODO
			
			return algorithm + "\n"
		}
		catch(NullPointerException e){
			return ""
		}
	}
	
	// generates events
	def GenerateEvent(){
		
	}
	
	def toALLcode(Root root) '''
//*****
//
// Generated with MM-DSL compiler for ADOxx 1.3 -- V 1.01
// MM-DSL is designed and developed by Niksa Visic
// Date: «GetCurrentDate /*"01.01.1970, 00:00"*/»
//
//*****
//
// The file contains the following libraries:
//
//  ADOxx 1.3 «root.methodname.name»
//  ADOxx 1.3 Dynamic «root.methodname.name»
//  ADOxx 1.3 Static «root.methodname.name»
//
//*****

VERSION <4.0>

//================================================================================
//================================================================================
APPLICATION LIBRARY <ADOxx 1.3 «root.methodname.name»>
//================================================================================
//================================================================================

//================================================================================
//================================================================================
BUSINESS PROCESS LIBRARY <ADOxx 1.3 Dynamic «root.methodname.name»>
//================================================================================
//================================================================================

	ATTRIBUTE <Version number>
	VALUE ""

	ATTRIBUTE <Date last changed>
	VALUE "«GetCurrentDate /*"01.01.1970, 00:00"*/»"

	ATTRIBUTE <Last user>
	VALUE "Admin"

	ATTRIBUTE <Keywords>
	VALUE "ADOxx - «root.methodname.name»"

	ATTRIBUTE <Comment>
	VALUE ""

	ATTRIBUTE <Description>
	VALUE "This library has been generated with the MM-DSL Compiler"

	ATTRIBUTE <Modi>
	VALUE "GENERAL order-of-classes:custom
  METHOD graphRep:\"Method GraphRep\" 
  {
    #-----------------------------------------------
    #«root.methodname.name»
    #-----------------------------------------------
    GROUP \"«root.methodname.name» Model Types\"
    {
    	«FOR ModelType m: root.method.metamodel.modeltype»
    	MODELTYPE \"«m.name»\" 
      	«ENDFOR»
    }
  }


  #---------------------------------------------------
  #«root.methodname.name» - Model Types
  #---------------------------------------------------

«FOR ModelType modeltype: root.method.metamodel.modeltype»
  MODELTYPE \"«modeltype.name»\" from:none plural:\"«modeltype.name»\" pos:0 not-simulateable 
  #---Classes:
  «FOR Class c: modeltype.classname»
  INCL \"«c.name»\"
  «ENDFOR»
  #---Relation Classes:
  «FOR Relation r: modeltype.relationname»
  INCL \"«r.name»\"
  «ENDFOR»
  #---Modes:
  «FOR Mode mod: modeltype.modename»
  MODE \"«mod.name»\" from:none
  #---Classes:
  «FOR Class c: mod.classname»
  INCL \"«c.name»\"
  «ENDFOR»
  #---Relation Classes:
  «FOR Relation r: mod.relationname»
  INCL \"«r.name»\"
  «ENDFOR»
  «ENDFOR»
«ENDFOR»"

	ATTRIBUTE <Page layouts>
	VALUE "LAYOUT \"Full page (without header/footer)\"
PAGE w:p h:p"

	ATTRIBUTE <Simmapping>
	VALUE "SIMOPTION undefined"

	ATTRIBUTE <Simtext>
	VALUE "SIMTEXT undefined"

	ATTRIBUTE <Queries>
	VALUE ""

	ATTRIBUTE <Input fields>
	VALUE ""

	ATTRIBUTE <AQL commands>
	VALUE ""

	ATTRIBUTE <Result attributes>
	VALUE ""

	ATTRIBUTE <Relation analysis>
	VALUE ""

	ATTRIBUTE <Service>
	VALUE ""

	ATTRIBUTE <User defined>
	VALUE "yes"

	ATTRIBUTE <Library icons>
	VALUE ""

	ATTRIBUTE <Evaluation queries>
	VALUE ""

	ATTRIBUTE <Evaluation input fields>
	VALUE ""

	ATTRIBUTE <Evaluation AQL commands>
	VALUE ""

	ATTRIBUTE <Evaluation result attributes>
	VALUE ""

	ATTRIBUTE <Sim result mapping>
	VALUE ""

	ATTRIBUTE <Numbering>
	VALUE "numeric"

	ATTRIBUTE <Graphical representation>
	VALUE "GRAPHREP
FILL color:aliceblue
RECTANGLE x:-.3cm y:-.3cm w:.6cm h:.6cm
"

	ATTRIBUTE <Days per year>
	VALUE 170

	ATTRIBUTE <Hours per day>
	VALUE 8

	ATTRIBUTE <CCC mapping>
	VALUE ""

	ATTRIBUTE <CCC default setting>
	VALUE ""

	ATTRIBUTE <Object arrangement>
	VALUE ""

	ATTRIBUTE <External coupling>
	VALUE "
	#INIT GLOBAL VARS
	ON_EVENT \"AppInitialized\"
	{
	}
	«FOR Algorithm algorithm: root.method.algorithm»
	«algorithm.GenerateAlgorithm»
	«ENDFOR»
	"

	ATTRIBUTE <Agent definition>
	VALUE ""

	ATTRIBUTE <Variable check>
	VALUE "off"

	ATTRIBUTE <Configuration of documentation>
	VALUE ""

	ATTRIBUTE <Default settings>
	VALUE "GRID snap:on visible:off w:0.50cm h:0.50cm
        GRADIENT_PRINTING mode:avg-color"

	ATTRIBUTE <Predefined queries>
	VALUE ""

	ATTRIBUTE <Predefined evaluation queries>
	VALUE ""

	ATTRIBUTE <Dynamic evaluation modules>
	VALUE ""

	ATTRIBUTE <Path navigator>
	VALUE ""

	ATTRIBUTE <Versioning format>
	VALUE ""


//================================================================================
CLASS <__LibraryMetaData__> : <__D-construct__>
//================================================================================

//--- Class <__LibraryMetaData__> - Class attributes------------------------------

	CLASSATTRIBUTE <homedir>
	TYPE STRING
	VALUE "c:\\Program Files (x86)\\BOC\\ADOxx13_EN_SA\\"

		FACET <MultiLineString>
		VALUE 0

		FACET <AttributeHelpText>
		VALUE ""

		FACET <AttributeRegularExpression>
		VALUE ""


	CLASSATTRIBUTE <__ModelListChangeCounter__>
	«toTypeInt»


	CLASSATTRIBUTE <__APListChangeCounter__>
	«toTypeInt»


	CLASSATTRIBUTE <ClassAbstract>
	VALUE 1


	CLASSATTRIBUTE <ClassVisible>
	VALUE 1


	CLASSATTRIBUTE <GraphRep>
	VALUE ""


	CLASSATTRIBUTE <VisibleAttrs>
	VALUE ""


	CLASSATTRIBUTE <AttrRep>
	VALUE "NOTEBOOK
	CHAPTER \"Description\"
	ATTR \"Name\"
	"


	CLASSATTRIBUTE <WF_Trans>
	VALUE ""


	CLASSATTRIBUTE <AnimRep>
	VALUE ""


	CLASSATTRIBUTE <HlpTxt>
	VALUE ""


	CLASSATTRIBUTE <Model pointer>
	VALUE ""


	CLASSATTRIBUTE <Class cardinality>
	VALUE ""



//--- Class <__LibraryMetaData__> - default values--------------------------------

	ATTRIBUTE <Position>
	VALUE ""


	ATTRIBUTE <External tool coupling>
	VALUE ""


«FOR Class c: root.method.metamodel.class_»
//================================================================================
CLASS <«c.name»> : <«IF c.parentclassname != null»«c.parentclassname.name»«ELSE»__D-construct__«ENDIF»>
//================================================================================

//--- Class <«c.name»> - Class attributes------------------------------------------
	«FOR ClassAttribute ca: c.classattribute»	
	CLASSATTRIBUTE <«ca.name»>
	«IF ca.type.simpletype == SimpleType::INT && ca.type.enumtype == null»
	«toTypeInt»
	«ELSEIF ca.type.simpletype == SimpleType::STRING && ca.type.enumtype == null»
	«toTypeString»
	«ELSEIF ca.type.simpletype == SimpleType::DOUBLE && ca.type.enumtype == null»
	«toTypeDouble»
	«ELSE»
	«toTypeEnum(ca)»
	«ENDIF»
	
	«ENDFOR»
	
	
	CLASSATTRIBUTE <ClassAbstract>
	VALUE 0


	CLASSATTRIBUTE <ClassVisible>
	VALUE 1


	CLASSATTRIBUTE <GraphRep>
	VALUE "GRAPHREP
	«IF c.symbolclass == null»
	«GenerateRandomClassSymbol»
	«ELSE»
	«c.generateCSymbol»
	«ENDIF»
	"
	

	CLASSATTRIBUTE <VisibleAttrs>
	VALUE ""


	CLASSATTRIBUTE <AttrRep>
	VALUE "NOTEBOOK
	CHAPTER \"Attributes\"
	ATTR \"Name\"
	«c.toNotebook»
	«IF c.parentclassname != null»«c.parentclassname.toNotebook»«ENDIF»
	"


	CLASSATTRIBUTE <WF_Trans>
	VALUE ""


	CLASSATTRIBUTE <AnimRep>
	VALUE ""


	CLASSATTRIBUTE <HlpTxt>
	VALUE ""


	CLASSATTRIBUTE <Model pointer>
	VALUE ""


	CLASSATTRIBUTE <Class cardinality>
	VALUE ""


//--- Class <«c.name»> - Instance attributes---------------------------------------
	
	«FOR Attribute a: c.attribute»	
	ATTRIBUTE <«a.name»>
	«IF a.type.simpletype == SimpleType::INT && a.type.enumtype == null»
	«toTypeInt»
	«ELSEIF a.type.simpletype == SimpleType::STRING && a.type.enumtype == null»
	«toTypeString»
	«ELSEIF a.type.simpletype == SimpleType::DOUBLE && a.type.enumtype == null»
	«toTypeDouble»
	«ELSE»
	«toTypeEnum(a)»
	«ENDIF»
	«ENDFOR»
	«FOR Reference ref: c.reference»
	«ref.toReference»
	
	«ENDFOR»
	//--- Class <«c.name»> - default values--------------------------------------------

	ATTRIBUTE <Position>
	VALUE ""


	ATTRIBUTE <External tool coupling>
	VALUE ""

«ENDFOR»

«FOR Relation r: root.method.metamodel.relation»
//================================================================================
RELATIONCLASS <«r.name»>
	FROM <«r.fromclassname.name»>
	TO <«r.toclassname.name»>
//================================================================================

//--- Relationclass <«r.name»> - Instance attributes----------------------------------

	ATTRIBUTE <Positions>
	TYPE STRING
	VALUE ""

		FACET <MultiLineString>
		VALUE 0

		FACET <AttributeHelpText>
		VALUE ""

		FACET <AttributeRegularExpression>
		VALUE ""


	ATTRIBUTE <GraphRep>
	TYPE STRING
	VALUE "GRAPHREP
	«IF r.symbolrelation == null»
	«GenerateRandomRelationSymobl»
	«ELSE»
	«r.generateRSymobl»
	«ENDIF»
	"

		FACET <MultiLineString>
		VALUE 0

		FACET <AttributeHelpText>
		VALUE ""

		FACET <AttributeRegularExpression>
		VALUE ""


	ATTRIBUTE <AttrRep>
	TYPE STRING
	VALUE "NOTEBOOK
	CHAPTER \"Attributes\"
	«r.toNotebook»
	"

		FACET <MultiLineString>
		VALUE 0

		FACET <AttributeHelpText>
		VALUE ""

		FACET <AttributeRegularExpression>
		VALUE ""
		
		
	«FOR Attribute a: r.attribute»
	ATTRIBUTE <«a.name»>
	«IF a.type.simpletype == SimpleType::INT && a.type.enumtype == null»
	«toTypeInt»
	«ELSEIF a.type.simpletype == SimpleType::STRING && a.type.enumtype == null»
	«toTypeString»
	«ELSEIF a.type.simpletype == SimpleType::DOUBLE && a.type.enumtype == null»
	«toTypeDouble»
	«ELSE»
	«toTypeEnum(a)»
	«ENDIF»
	
	«ENDFOR»

«ENDFOR»
//================================================================================
//================================================================================
WORKING ENVIRONMENT LIBRARY <ADOxx 1.3 Static «root.methodname.name»>
//================================================================================
//================================================================================

	ATTRIBUTE <Version number>
	VALUE ""

	ATTRIBUTE <Date last changed>
	VALUE "12.02.2013, 09:51"

	ATTRIBUTE <Last user>
	VALUE "Admin"

	ATTRIBUTE <Keywords>
	VALUE ""

	ATTRIBUTE <Comment>
	VALUE ""

	ATTRIBUTE <Description>
	VALUE ""

	ATTRIBUTE <Modi>
	VALUE " "

	ATTRIBUTE <Page layouts>
	VALUE ""

	ATTRIBUTE <Simmapping>
	VALUE ""

	ATTRIBUTE <Simtext>
	VALUE ""

	ATTRIBUTE <Queries>
	VALUE ""

	ATTRIBUTE <Input fields>
	VALUE ""

	ATTRIBUTE <AQL commands>
	VALUE ""

	ATTRIBUTE <Result attributes>
	VALUE ""

	ATTRIBUTE <Relation analysis>
	VALUE ""

	ATTRIBUTE <Service>
	VALUE ""

	ATTRIBUTE <User defined>
	VALUE "yes"

	ATTRIBUTE <Library icons>
	VALUE ""

	ATTRIBUTE <Evaluation queries>
	VALUE ""

	ATTRIBUTE <Evaluation input fields>
	VALUE ""

	ATTRIBUTE <Evaluation AQL commands>
	VALUE ""

	ATTRIBUTE <Evaluation result attributes>
	VALUE ""

	ATTRIBUTE <Sim result mapping>
	VALUE ""

	ATTRIBUTE <Numbering>
	VALUE "numeric"

	ATTRIBUTE <Graphical representation>
	VALUE ""

	ATTRIBUTE <Days per year>
	VALUE 0

	ATTRIBUTE <Hours per day>
	VALUE 0

	ATTRIBUTE <CCC mapping>
	VALUE ""

	ATTRIBUTE <CCC default setting>
	VALUE ""

	ATTRIBUTE <Object arrangement>
	VALUE ""

	ATTRIBUTE <External coupling>
	VALUE ""

	ATTRIBUTE <Agent definition>
	VALUE ""

	ATTRIBUTE <Variable check>
	VALUE "on"

	ATTRIBUTE <Configuration of documentation>
	VALUE ""

	ATTRIBUTE <Default settings>
	VALUE ""

	ATTRIBUTE <Predefined queries>
	VALUE ""

	ATTRIBUTE <Predefined evaluation queries>
	VALUE ""

	ATTRIBUTE <Dynamic evaluation modules>
	VALUE ""

	ATTRIBUTE <Path navigator>
	VALUE ""

	ATTRIBUTE <Versioning format>
	VALUE ""
	'''
}

