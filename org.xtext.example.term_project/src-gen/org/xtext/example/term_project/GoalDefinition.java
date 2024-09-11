/**
 * generated by Xtext 2.36.0
 */
package org.xtext.example.term_project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.term_project.GoalDefinition#getX <em>X</em>}</li>
 *   <li>{@link org.xtext.example.term_project.GoalDefinition#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.term_project.Term_projectPackage#getGoalDefinition()
 * @model
 * @generated
 */
public interface GoalDefinition extends Team_goal_or_task
{
  /**
   * Returns the value of the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' attribute.
   * @see #setX(int)
   * @see org.xtext.example.term_project.Term_projectPackage#getGoalDefinition_X()
   * @model
   * @generated
   */
  int getX();

  /**
   * Sets the value of the '{@link org.xtext.example.term_project.GoalDefinition#getX <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' attribute.
   * @see #getX()
   * @generated
   */
  void setX(int value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' attribute.
   * @see #setY(int)
   * @see org.xtext.example.term_project.Term_projectPackage#getGoalDefinition_Y()
   * @model
   * @generated
   */
  int getY();

  /**
   * Sets the value of the '{@link org.xtext.example.term_project.GoalDefinition#getY <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' attribute.
   * @see #getY()
   * @generated
   */
  void setY(int value);

} // GoalDefinition
