/**
 * generated by Xtext 2.36.0
 */
package org.xtext.example.term_project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.term_project.TeamDefinition#getRobots <em>Robots</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.term_project.Term_projectPackage#getTeamDefinition()
 * @model
 * @generated
 */
public interface TeamDefinition extends Team_goal_or_task
{
  /**
   * Returns the value of the '<em><b>Robots</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.term_project.RobotDefinition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Robots</em>' containment reference list.
   * @see org.xtext.example.term_project.Term_projectPackage#getTeamDefinition_Robots()
   * @model containment="true"
   * @generated
   */
  EList<RobotDefinition> getRobots();

} // TeamDefinition
