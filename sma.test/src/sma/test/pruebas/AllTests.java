package sma.test.pruebas;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import sma.ModelFactory;
import sma.smaFactory;

@RunWith(Suite.class)
@SuiteClasses({ 
	RegistrosTest.class,
	RegistroVehiculoTest.class,
	GestionDeVisitaTest.class})
public class AllTests {
	
	static ModelFactory modelFactory;
	


	@BeforeClass
	public static void beforeClass()
	{
		modelFactory = smaFactory.eINSTANCE.createModelFactory();
		modelFactory.implementarModelo();
	}

	public static ModelFactory getModelFactory() {
		return modelFactory;
	}

	public static void setModelFactory(ModelFactory modelFactory) {
		AllTests.modelFactory = modelFactory;
	}
}


