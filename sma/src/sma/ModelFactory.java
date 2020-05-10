/**
 */
package sma;

import org.eclipse.emf.ecore.EObject;

import sma.domain.Domain;

import sma.ui.UI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ModelFactory#getTheUI <em>The UI</em>}</li>
 *   <li>{@link sma.ModelFactory#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 *
 * @see sma.smaPackage#getModelFactory()
 * @model
 * @generated
 */
public interface ModelFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>The UI</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.UI#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The UI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The UI</em>' containment reference.
	 * @see #setTheUI(UI)
	 * @see sma.smaPackage#getModelFactory_TheUI()
	 * @see sma.ui.UI#getTheModelFactory
	 * @model opposite="theModelFactory" containment="true"
	 * @generated
	 */
	UI getTheUI();

	/**
	 * Sets the value of the '{@link sma.ModelFactory#getTheUI <em>The UI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The UI</em>' containment reference.
	 * @see #getTheUI()
	 * @generated
	 */
	void setTheUI(UI value);

	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.domain.Domain#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' containment reference.
	 * @see #setTheDomain(Domain)
	 * @see sma.smaPackage#getModelFactory_TheDomain()
	 * @see sma.domain.Domain#getTheModelFactory
	 * @model opposite="theModelFactory" containment="true"
	 * @generated
	 */
	Domain getTheDomain();

	/**
	 * Sets the value of the '{@link sma.ModelFactory#getTheDomain <em>The Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain</em>' containment reference.
	 * @see #getTheDomain()
	 * @generated
	 */
	void setTheDomain(Domain value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rutaDataType="sma.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ModelFactory modelFactory = null;\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\torg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/\"+ruta);\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\torg.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\torg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\ttry {\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tresource.load(java.util.Collections.EMPTY_MAP);\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmodelFactory = (ModelFactory) resource.getContents().get(0);\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t} catch (java.io.IOException e) {\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// TO-DO Auto-generated catch block\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\te.printStackTrace();\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn modelFactory;'"
	 * @generated
	 */
	ModelFactory cargar(String ruta);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rutaDataType="sma.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ModelFactory modelFactory = this;\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\torg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/\"+ruta);\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\torg.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\torg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tresource.getContents().add(modelFactory);\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\ttry {\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tresource.save(java.util.Collections.EMPTY_MAP);\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t} catch (java.io.IOException e) {\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// TO-DO Auto-generated catch block\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\te.printStackTrace();\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn;'"
	 * @generated
	 */
	void salvar(String ruta);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='UI ui = getTheUI();\r\n\t\tDomain domain = getTheDomain();\r\n\r\n\t\tif (domain == null) {\r\n\t\t\tdomain = sma.domain.DomainFactory.eINSTANCE.createDomain();\r\n\t\t}\r\n\r\n\t\tif (ui == null) {\r\n\t\t\tui = sma.ui.UiFactory.eINSTANCE.createUI();\r\n\t\t}\r\n\r\n\t\tsetTheDomain(domain);\r\n\t\tsetTheUI(ui);\r\n\t\tui.setTheDomain(domain);\r\n\t\tdomain.setTheUI(ui);\r\n\r\n\t\tdomain.implementarModelo();\r\n\t\tui.implementarModelo();'"
	 * @generated
	 */
	void implementarModelo();

} // ModelFactory
