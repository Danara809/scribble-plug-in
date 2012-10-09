/**
 */
package org.scribble.scribble.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.scribble.scribble.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.scribble.scribble.ScribblePackage
 * @generated
 */
public class ScribbleAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ScribblePackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ScribbleAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = ScribblePackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ScribbleSwitch<Adapter> modelSwitch =
    new ScribbleSwitch<Adapter>() {
			@Override
			public Adapter caseScribbleProgram(ScribbleProgram object) {
				return createScribbleProgramAdapter();
			}
			@Override
			public Adapter caseIncludeDecl(IncludeDecl object) {
				return createIncludeDeclAdapter();
			}
			@Override
			public Adapter caseInstGlobalProtocolDecl(InstGlobalProtocolDecl object) {
				return createInstGlobalProtocolDeclAdapter();
			}
			@Override
			public Adapter caseTypeDecl(TypeDecl object) {
				return createTypeDeclAdapter();
			}
			@Override
			public Adapter caseGlobalProtocolDecl(GlobalProtocolDecl object) {
				return createGlobalProtocolDeclAdapter();
			}
			@Override
			public Adapter caseGlobalInteractionBlock(GlobalInteractionBlock object) {
				return createGlobalInteractionBlockAdapter();
			}
			@Override
			public Adapter caseGlobalInteraction(GlobalInteraction object) {
				return createGlobalInteractionAdapter();
			}
			@Override
			public Adapter caseSpawn(Spawn object) {
				return createSpawnAdapter();
			}
			@Override
			public Adapter caseDo(Do object) {
				return createDoAdapter();
			}
			@Override
			public Adapter caseInterruptible(Interruptible object) {
				return createInterruptibleAdapter();
			}
			@Override
			public Adapter caseContinue(Continue object) {
				return createContinueAdapter();
			}
			@Override
			public Adapter caseRecursion(Recursion object) {
				return createRecursionAdapter();
			}
			@Override
			public Adapter caseParallel(Parallel object) {
				return createParallelAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseMessageSignature(MessageSignature object) {
				return createMessageSignatureAdapter();
			}
			@Override
			public Adapter casePayloadType(PayloadType object) {
				return createPayloadTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link org.scribble.scribble.ScribbleProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scribble.scribble.ScribbleProgram
	 * @generated
	 */
  public Adapter createScribbleProgramAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.scribble.scribble.IncludeDecl <em>Include Decl</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scribble.scribble.IncludeDecl
	 * @generated
	 */
  public Adapter createIncludeDeclAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.scribble.scribble.InstGlobalProtocolDecl <em>Inst Global Protocol Decl</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scribble.scribble.InstGlobalProtocolDecl
	 * @generated
	 */
  public Adapter createInstGlobalProtocolDeclAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.scribble.scribble.TypeDecl <em>Type Decl</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scribble.scribble.TypeDecl
	 * @generated
	 */
  public Adapter createTypeDeclAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.scribble.scribble.GlobalProtocolDecl <em>Global Protocol Decl</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scribble.scribble.GlobalProtocolDecl
	 * @generated
	 */
  public Adapter createGlobalProtocolDeclAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.scribble.scribble.GlobalInteractionBlock <em>Global Interaction Block</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scribble.scribble.GlobalInteractionBlock
	 * @generated
	 */
  public Adapter createGlobalInteractionBlockAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.scribble.scribble.GlobalInteraction <em>Global Interaction</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scribble.scribble.GlobalInteraction
	 * @generated
	 */
  public Adapter createGlobalInteractionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.scribble.scribble.Spawn <em>Spawn</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scribble.scribble.Spawn
	 * @generated
	 */
  public Adapter createSpawnAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.scribble.scribble.Do <em>Do</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scribble.scribble.Do
	 * @generated
	 */
  public Adapter createDoAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.scribble.scribble.Interruptible <em>Interruptible</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scribble.scribble.Interruptible
	 * @generated
	 */
  public Adapter createInterruptibleAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.scribble.scribble.Continue <em>Continue</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scribble.scribble.Continue
	 * @generated
	 */
  public Adapter createContinueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.scribble.scribble.Recursion <em>Recursion</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scribble.scribble.Recursion
	 * @generated
	 */
  public Adapter createRecursionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.scribble.scribble.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scribble.scribble.Parallel
	 * @generated
	 */
  public Adapter createParallelAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.scribble.scribble.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scribble.scribble.Choice
	 * @generated
	 */
  public Adapter createChoiceAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.scribble.scribble.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scribble.scribble.Message
	 * @generated
	 */
  public Adapter createMessageAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.scribble.scribble.MessageSignature <em>Message Signature</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scribble.scribble.MessageSignature
	 * @generated
	 */
  public Adapter createMessageSignatureAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.scribble.scribble.PayloadType <em>Payload Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.scribble.scribble.PayloadType
	 * @generated
	 */
  public Adapter createPayloadTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //ScribbleAdapterFactory
