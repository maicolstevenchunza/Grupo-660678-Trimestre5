/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.akuavida.integracion.dto;

import edu.co.sena.akuavida.integracion.dao.*;
import edu.co.sena.akuavida.integracion.factory.*;
import edu.co.sena.akuavida.integracion.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class CarritoDeCompras implements Serializable
{
	/** 
	 * This attribute maps to the column ID_Carrito in the carrito_de_compras table.
	 */
	protected String idCarrito;

	/** 
	 * This attribute represents whether the attribute idCarrito has been modified since being read from the database.
	 */
	protected boolean idCarritoModified = false;

	/** 
	 * This attribute maps to the column precio in the carrito_de_compras table.
	 */
	protected float precio;

	/** 
	 * This attribute represents whether the attribute precio has been modified since being read from the database.
	 */
	protected boolean precioModified = false;

	/** 
	 * This attribute maps to the column Total in the carrito_de_compras table.
	 */
	protected float total;

	/** 
	 * This attribute represents whether the attribute total has been modified since being read from the database.
	 */
	protected boolean totalModified = false;

	/** 
	 * This attribute maps to the column Subtotal in the carrito_de_compras table.
	 */
	protected float subtotal;

	/** 
	 * This attribute represents whether the attribute subtotal has been modified since being read from the database.
	 */
	protected boolean subtotalModified = false;

	/**
	 * Method 'CarritoDeCompras'
	 * 
	 */
	public CarritoDeCompras()
	{
	}

	/**
	 * Method 'getIdCarrito'
	 * 
	 * @return String
	 */
	public String getIdCarrito()
	{
		return idCarrito;
	}

	/**
	 * Method 'setIdCarrito'
	 * 
	 * @param idCarrito
	 */
	public void setIdCarrito(String idCarrito)
	{
		this.idCarrito = idCarrito;
		this.idCarritoModified = true;
	}

	/** 
	 * Sets the value of idCarritoModified
	 */
	public void setIdCarritoModified(boolean idCarritoModified)
	{
		this.idCarritoModified = idCarritoModified;
	}

	/** 
	 * Gets the value of idCarritoModified
	 */
	public boolean isIdCarritoModified()
	{
		return idCarritoModified;
	}

	/**
	 * Method 'getPrecio'
	 * 
	 * @return float
	 */
	public float getPrecio()
	{
		return precio;
	}

	/**
	 * Method 'setPrecio'
	 * 
	 * @param precio
	 */
	public void setPrecio(float precio)
	{
		this.precio = precio;
		this.precioModified = true;
	}

	/** 
	 * Sets the value of precioModified
	 */
	public void setPrecioModified(boolean precioModified)
	{
		this.precioModified = precioModified;
	}

	/** 
	 * Gets the value of precioModified
	 */
	public boolean isPrecioModified()
	{
		return precioModified;
	}

	/**
	 * Method 'getTotal'
	 * 
	 * @return float
	 */
	public float getTotal()
	{
		return total;
	}

	/**
	 * Method 'setTotal'
	 * 
	 * @param total
	 */
	public void setTotal(float total)
	{
		this.total = total;
		this.totalModified = true;
	}

	/** 
	 * Sets the value of totalModified
	 */
	public void setTotalModified(boolean totalModified)
	{
		this.totalModified = totalModified;
	}

	/** 
	 * Gets the value of totalModified
	 */
	public boolean isTotalModified()
	{
		return totalModified;
	}

	/**
	 * Method 'getSubtotal'
	 * 
	 * @return float
	 */
	public float getSubtotal()
	{
		return subtotal;
	}

	/**
	 * Method 'setSubtotal'
	 * 
	 * @param subtotal
	 */
	public void setSubtotal(float subtotal)
	{
		this.subtotal = subtotal;
		this.subtotalModified = true;
	}

	/** 
	 * Sets the value of subtotalModified
	 */
	public void setSubtotalModified(boolean subtotalModified)
	{
		this.subtotalModified = subtotalModified;
	}

	/** 
	 * Gets the value of subtotalModified
	 */
	public boolean isSubtotalModified()
	{
		return subtotalModified;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof CarritoDeCompras)) {
			return false;
		}
		
		final CarritoDeCompras _cast = (CarritoDeCompras) _other;
		if (idCarrito == null ? _cast.idCarrito != idCarrito : !idCarrito.equals( _cast.idCarrito )) {
			return false;
		}
		
		if (idCarritoModified != _cast.idCarritoModified) {
			return false;
		}
		
		if (precio != _cast.precio) {
			return false;
		}
		
		if (precioModified != _cast.precioModified) {
			return false;
		}
		
		if (total != _cast.total) {
			return false;
		}
		
		if (totalModified != _cast.totalModified) {
			return false;
		}
		
		if (subtotal != _cast.subtotal) {
			return false;
		}
		
		if (subtotalModified != _cast.subtotalModified) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (idCarrito != null) {
			_hashCode = 29 * _hashCode + idCarrito.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (idCarritoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(precio);
		_hashCode = 29 * _hashCode + (precioModified ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(total);
		_hashCode = 29 * _hashCode + (totalModified ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(subtotal);
		_hashCode = 29 * _hashCode + (subtotalModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CarritoDeComprasPk
	 */
	public CarritoDeComprasPk createPk()
	{
		return new CarritoDeComprasPk(idCarrito);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.akuavida.integracion.dto.CarritoDeCompras: " );
		ret.append( "idCarrito=" + idCarrito );
		ret.append( ", precio=" + precio );
		ret.append( ", total=" + total );
		ret.append( ", subtotal=" + subtotal );
		return ret.toString();
	}

}