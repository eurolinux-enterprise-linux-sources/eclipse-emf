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
 * $Id: XSDFloatType.java,v 1.9 2008/12/22 14:25:48 emerks Exp $
 */
package org.eclipse.xsd.impl.type;

public class XSDFloatType extends XSDAnySimpleType
{
  protected static final Float NaN = Float.NaN;
  protected static final Float NEGATIVE_INFINITY = Float.NEGATIVE_INFINITY;
  protected static final Float POSITIVE_INFINITY = Float.POSITIVE_INFINITY;
  
  @Override
  public Object getValue(String literal)
  {
    try 
    {
      if ("Nan".equals(literal))
      {
        return NaN;
      }
      else if ("-INF".equals(literal))
      {
        return NEGATIVE_INFINITY;
      }
      else if ("INF".equals(literal))
      {
        return POSITIVE_INFINITY;
      }
      else
      {
        return new Float(literal);
      }
    }
    catch (NumberFormatException e)
    {
      return null;
    }
  }

  @Override
  public int compareValues(Object value1, Object value2)
  {
    return ((Float)value1).compareTo((Float)value2);
  }
}
