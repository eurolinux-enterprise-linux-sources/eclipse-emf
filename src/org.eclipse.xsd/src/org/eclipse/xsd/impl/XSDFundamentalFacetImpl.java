/**
 * <copyright>
 *
 * Copyright (c) 2002-2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: XSDFundamentalFacetImpl.java,v 1.8 2006/12/29 18:16:22 marcelop Exp $
 */
package org.eclipse.xsd.impl;


import org.eclipse.emf.ecore.EClass;

import org.eclipse.xsd.XSDFundamentalFacet;
import org.eclipse.xsd.XSDPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fundamental Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class XSDFundamentalFacetImpl 
  extends XSDFacetImpl 
  implements XSDFundamentalFacet
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XSDFundamentalFacetImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XSDPackage.Literals.XSD_FUNDAMENTAL_FACET;
  }

} 
