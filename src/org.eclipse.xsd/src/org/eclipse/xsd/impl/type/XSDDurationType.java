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
 * $Id: XSDDurationType.java,v 1.5 2006/12/29 18:16:22 marcelop Exp $
 */
package org.eclipse.xsd.impl.type;

import org.eclipse.emf.ecore.xml.type.internal.XMLDuration;


public class XSDDurationType extends XSDAnySimpleType
{

  @Override
  public Object getValue(String normalizedLiteral)
  {
    try
    {
      return new XMLDuration(normalizedLiteral);
    }
    catch (RuntimeException exception)
    {
      return null;
    }
  }

  @Override
  public int compareValues(Object value1, Object value2)
  {
    return XMLDuration.compare((XMLDuration)value1, (XMLDuration)value2);
  }
}
