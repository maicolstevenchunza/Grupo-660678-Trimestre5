/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.akuavida.negocio.example2;

import edu.co.sena.akuavida.negocio.example.*;
import java.math.*;
import java.util.Date;
import java.util.Collection;
import edu.co.sena.akuavida.integracion.dao.ProductoDao;
import edu.co.sena.akuavida.integracion.dto.Producto;
import edu.co.sena.akuavida.integracion.exceptions.ProductoDaoException;
import edu.co.sena.akuavida.integracion.factory.ProductoDaoFactory;

public class ProductoDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findByCategorias(0);
		// findWhereIdProductoEquals("");
		// findWhereNombreEquals("");
		// findWherePrecioEquals(0);
		// findWhereImagenEquals(null);
		// findWhereDescripcionEquals("");
		// findWhereCantidadEquals(0);
		// findWhereActivoEquals(0);
		// findWhereImpuestoEquals(0);
		// findWhereCategoriasIdCategoriaEquals(0);
            
            Producto prod = new Producto();
            prod.setIdProducto("1");
            prod.setNombre("Acero ");
            prod.setPrecio(950000);
            prod.setDescripcion("Es algo para mejorar su salud");
            prod.setCantidad(10);
            prod.setActivo(new Short ("1"));
            prod.setImpuesto(0);
            prod.setCategoriasIdCategoria(1);
            
            ProductoDao pr = getProductoDao();
            pr.insert(prod);
            findAll();
            
            System.out.println("-------------------");
           
            prod.setCantidad(15);
            prod.setPrecio(450000);
            pr.update(prod.createPk(), prod);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByCategorias'
	 * 
	 * @param categoriasIdCategoria
	 */
	public static void findByCategorias(int categoriasIdCategoria)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findByCategorias(categoriasIdCategoria);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdProductoEquals'
	 * 
	 * @param idProducto
	 */
	public static void findWhereIdProductoEquals(String idProducto)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereIdProductoEquals(idProducto);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNombreEquals'
	 * 
	 * @param nombre
	 */
	public static void findWhereNombreEquals(String nombre)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereNombreEquals(nombre);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWherePrecioEquals'
	 * 
	 * @param precio
	 */
	public static void findWherePrecioEquals(float precio)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWherePrecioEquals(precio);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereImagenEquals'
	 * 
	 * @param imagen
	 */
	public static void findWhereImagenEquals(byte[] imagen)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereImagenEquals(imagen);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereDescripcionEquals'
	 * 
	 * @param descripcion
	 */
	public static void findWhereDescripcionEquals(String descripcion)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereDescripcionEquals(descripcion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCantidadEquals'
	 * 
	 * @param cantidad
	 */
	public static void findWhereCantidadEquals(int cantidad)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereCantidadEquals(cantidad);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereActivoEquals'
	 * 
	 * @param activo
	 */
	public static void findWhereActivoEquals(short activo)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereActivoEquals(activo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereImpuestoEquals'
	 * 
	 * @param impuesto
	 */
	public static void findWhereImpuestoEquals(float impuesto)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereImpuestoEquals(impuesto);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCategoriasIdCategoriaEquals'
	 * 
	 * @param categoriasIdCategoria
	 */
	public static void findWhereCategoriasIdCategoriaEquals(int categoriasIdCategoria)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereCategoriasIdCategoriaEquals(categoriasIdCategoria);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getProductoDao'
	 * 
	 * @return ProductoDao
	 */
	public static ProductoDao getProductoDao()
	{
		return ProductoDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Producto dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getIdProducto() );
		buf.append( ", " );
		buf.append( dto.getNombre() );
		buf.append( ", " );
		buf.append( dto.getPrecio() );
		buf.append( ", " );
		buf.append( dto.getImagen() );
		buf.append( ", " );
		buf.append( dto.getDescripcion() );
		buf.append( ", " );
		buf.append( dto.getCantidad() );
		buf.append( ", " );
		buf.append( dto.getActivo() );
		buf.append( ", " );
		buf.append( dto.getImpuesto() );
		buf.append( ", " );
		buf.append( dto.getCategoriasIdCategoria() );
		System.out.println( buf.toString() );
	}

}