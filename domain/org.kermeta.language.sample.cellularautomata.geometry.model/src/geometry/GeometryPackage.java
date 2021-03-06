/**
 */
package geometry;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see geometry.GeometryFactory
 * @model kind="package"
 * @generated
 */
public interface GeometryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "geometry";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://geometry/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "geometry";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeometryPackage eINSTANCE = geometry.impl.GeometryPackageImpl.init();

	/**
	 * The meta object id for the '{@link geometry.impl.GeometryImpl <em>Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry.impl.GeometryImpl
	 * @see geometry.impl.GeometryPackageImpl#getGeometry()
	 * @generated
	 */
	int GEOMETRY = 0;

	/**
	 * The number of structural features of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link geometry.impl.RegularGeometryImpl <em>Regular Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry.impl.RegularGeometryImpl
	 * @see geometry.impl.GeometryPackageImpl#getRegularGeometry()
	 * @generated
	 */
	int REGULAR_GEOMETRY = 1;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_GEOMETRY__DIMENSIONS = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Neighbors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_GEOMETRY__NEIGHBORS = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Regular Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_GEOMETRY_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link geometry.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry.impl.DimensionImpl
	 * @see geometry.impl.GeometryPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 2;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__EXTENT = 0;

	/**
	 * The feature id for the '<em><b>Is Circular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__IS_CIRCULAR = 1;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link geometry.Neighborhood <em>Neighborhood</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry.Neighborhood
	 * @see geometry.impl.GeometryPackageImpl#getNeighborhood()
	 * @generated
	 */
	int NEIGHBORHOOD = 3;


	/**
	 * Returns the meta object for class '{@link geometry.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry</em>'.
	 * @see geometry.Geometry
	 * @generated
	 */
	EClass getGeometry();

	/**
	 * Returns the meta object for class '{@link geometry.RegularGeometry <em>Regular Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Geometry</em>'.
	 * @see geometry.RegularGeometry
	 * @generated
	 */
	EClass getRegularGeometry();

	/**
	 * Returns the meta object for the containment reference list '{@link geometry.RegularGeometry#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimensions</em>'.
	 * @see geometry.RegularGeometry#getDimensions()
	 * @see #getRegularGeometry()
	 * @generated
	 */
	EReference getRegularGeometry_Dimensions();

	/**
	 * Returns the meta object for the attribute '{@link geometry.RegularGeometry#getNeighbors <em>Neighbors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neighbors</em>'.
	 * @see geometry.RegularGeometry#getNeighbors()
	 * @see #getRegularGeometry()
	 * @generated
	 */
	EAttribute getRegularGeometry_Neighbors();

	/**
	 * Returns the meta object for class '{@link geometry.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see geometry.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '{@link geometry.Dimension#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extent</em>'.
	 * @see geometry.Dimension#getExtent()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Extent();

	/**
	 * Returns the meta object for the attribute '{@link geometry.Dimension#isIsCircular <em>Is Circular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Circular</em>'.
	 * @see geometry.Dimension#isIsCircular()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_IsCircular();

	/**
	 * Returns the meta object for enum '{@link geometry.Neighborhood <em>Neighborhood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Neighborhood</em>'.
	 * @see geometry.Neighborhood
	 * @generated
	 */
	EEnum getNeighborhood();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeometryFactory getGeometryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link geometry.impl.GeometryImpl <em>Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry.impl.GeometryImpl
		 * @see geometry.impl.GeometryPackageImpl#getGeometry()
		 * @generated
		 */
		EClass GEOMETRY = eINSTANCE.getGeometry();

		/**
		 * The meta object literal for the '{@link geometry.impl.RegularGeometryImpl <em>Regular Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry.impl.RegularGeometryImpl
		 * @see geometry.impl.GeometryPackageImpl#getRegularGeometry()
		 * @generated
		 */
		EClass REGULAR_GEOMETRY = eINSTANCE.getRegularGeometry();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_GEOMETRY__DIMENSIONS = eINSTANCE.getRegularGeometry_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Neighbors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_GEOMETRY__NEIGHBORS = eINSTANCE.getRegularGeometry_Neighbors();

		/**
		 * The meta object literal for the '{@link geometry.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry.impl.DimensionImpl
		 * @see geometry.impl.GeometryPackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Extent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__EXTENT = eINSTANCE.getDimension_Extent();

		/**
		 * The meta object literal for the '<em><b>Is Circular</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__IS_CIRCULAR = eINSTANCE.getDimension_IsCircular();

		/**
		 * The meta object literal for the '{@link geometry.Neighborhood <em>Neighborhood</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry.Neighborhood
		 * @see geometry.impl.GeometryPackageImpl#getNeighborhood()
		 * @generated
		 */
		EEnum NEIGHBORHOOD = eINSTANCE.getNeighborhood();

	}

} //GeometryPackage
