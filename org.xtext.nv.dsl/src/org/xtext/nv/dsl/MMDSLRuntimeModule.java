/*
 * generated by Xtext
 */
package org.xtext.nv.dsl;

import org.eclipse.xtext.generator.IGenerator;
import org.xtext.nv.dsl.generator.MMDSLGenerator;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class MMDSLRuntimeModule extends org.xtext.nv.dsl.AbstractMMDSLRuntimeModule {
	/**
     * Avoids to use the default org.eclipse.xtext.xbase.compiler.JvmModelGenerator
     * when using xbase.
     * @see org.xtext.example.helloxbase.AbstractHelloXbaseRuntimeModule#bindIGenerator()
     */
    @Override
    public Class<? extends IGenerator> bindIGenerator() {
        return MMDSLGenerator.class;
    }	
}