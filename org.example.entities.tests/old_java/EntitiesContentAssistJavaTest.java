package org.example.entities.ui.tests;

import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.junit4.ui.AbstractContentAssistProcessorTest;
import org.example.entities.EntitiesUiInjectorProvider;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.inject.Injector;

/**
 * The Java version of the content assist test is here
 * just for demonstration.
 * 
 * @author Lorenzo Bettini
 *
 */
public class EntitiesContentAssistJavaTest extends
        AbstractContentAssistProcessorTest {
    
    @BeforeClass
    public static void useStaticInjector() {
        useStaticInjector = false;
    }
    
    @Test
    public void testEmptyProgram() throws Exception {
        newBuilder().append(" ").assertText("entity");
    }
    
    @Test
    public void testSuperEntity() throws Exception {
        newBuilder().append("entity E extends ").assertText("E");
    }

    @Test
    public void testAttributeTypes() throws Exception {
        newBuilder().append("entity E { ").
            assertText("E", "boolean", "int", "string", "}");
    }

    protected ISetup doGetSetup() {
        return new ISetup() {
            public Injector createInjectorAndDoEMFRegistration() {
                return new EntitiesUiInjectorProvider().getInjector();
            }
        };
    }

}
