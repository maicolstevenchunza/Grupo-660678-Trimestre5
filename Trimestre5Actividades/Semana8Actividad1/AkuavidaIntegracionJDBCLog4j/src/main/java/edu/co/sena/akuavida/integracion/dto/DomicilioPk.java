/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.akuavida.integracion.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the domicilio table.
 */
public class DomicilioPk implements Serializable
{
	protected String cuentaTipoDocumento;

	protected String cuentaNumeroDocumento;

	/** 
	 * Sets the value of cuentaTipoDocumento
	 */
	public void setCuentaTipoDocumento(String cuentaTipoDocumento)
	{
		this.cuentaTipoDocumento = cuentaTipoDocumento;
	}

	/** 
	 * Gets the value of cuentaTipoDocumento
	 */
	public String getCuentaTipoDocumento()
	{
		return cuentaTipoDocumento;
	}

	/** 
	 * Sets the value of cuentaNumeroDocumento
	 */
	public void setCuentaNumeroDocumento(String cuentaNumeroDocumento)
	{
		this.cuentaNumeroDocumento = cuentaNumeroDocumento;
	}

	/** 
	 * Gets the value of cuentaNumeroDocumento
	 */
	public String getCuentaNumeroDocumento()
	{
		return cuentaNumeroDocumento;
	}

	/**
	 * Method 'DomicilioPk'
	 * 
	 */
	public DomicilioPk()
	{
	}

	/**
	 * Method 'DomicilioPk'
	 * 
	 * @param cuentaTipoDocumento
	 * @param cuentaNumeroDocumento
	 */
	public DomicilioPk(final String cuentaTipoDocumento, final String cuentaNumeroDocumento)
	{
		this.cuentaTipoDocumento = cuentaTipoDocumento;
		this.cuentaNumeroDocumento = cuentaNumeroDocumento;
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
		
		if (!(_other instanceof DomicilioPk)) {
			return false;
		}
		
		final DomicilioPk _cast = (DomicilioPk) _other;
		if (cuentaTipoDocumento == null ? _cast.cuentaTipoDocumento != cuentaTipoDocumento : !cuentaTipoDocumento.equals( _cast.cuentaTipoDocumento )) {
			return false;
		}
		
		if (cuentaNumeroDocumento == null ? _cast.cuentaNumeroDocumento != cuentaNumeroDocumento : !cuentaNumeroDocumento.equals( _cast.cuentaNumeroDocumento )) {
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
		if (cuentaTipoDocumento != null) {
			_hashCode = 29 * _hashCode + cuentaTipoDocumento.hashCode();
		}
		
		if (cuentaNumeroDocumento != null) {
			_hashCode = 29 * _hashCode + cuentaNumeroDocumento.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.akuavida.integracion.dto.DomicilioPk: " );
		ret.append( "cuentaTipoDocumento=" + cuentaTipoDocumento );
		ret.append( ", cuentaNumeroDocumento=" + cuentaNumeroDocumento );
		return ret.toString();
	}

}