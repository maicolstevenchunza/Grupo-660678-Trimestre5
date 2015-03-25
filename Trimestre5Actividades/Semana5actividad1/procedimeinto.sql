-- procedimiento

delimiter /
create procedure akuavida.insertProducto(numProducto varchar(200),
numCategoria int,
nombre varchar(60),
precio float,
imagen longblob,
descripcion longtext,
cantidad int,
activo bool,
impuesto float)
begin
INSERT INTO `akuavida`.`producto`
(`ID_producto`,
`Categorias_ID_Categoria`,
`Nombre`,
`Precio`,
`Imagen`,
`Descripcion`,
`Cantidad`,
`Activo`,
`impuesto`)
VALUES
(numProducto,
numCategoria,
nombre,
precio,
imagen,
descripcion,
cantidad,
activo,
impuesto);
end/



-- carrito de compras
delimiter /
create procedure akuavida.insertCarritoDeCompras(numCarrito int,
total float,
subtotal float
)
begin
INSERT INTO `akuavida`.`carrito_de_compras`
(`ID_Carrito`,
`Total`,
`Subtotal`)
VALUES
(numCarrito,
total,
subtotal);
end/

-- categoria

delimiter /
create procedure akuavida.insertCategoria(numCategoria int,
nombre varchar(45),
activa bool,
pariente int
)
begin
INSERT INTO `akuavida`.`categorias`
(`ID_Categoria`,
`Nombre`,
`Activa`,
`Pariente`)
VALUES
(numCategoria,
nombre,
activa,
pariente);
end/

-- cuenta

delimiter /
create procedure akuavida.insertCuenta(tipoDocumento varchar(10),
numDocumento varchar(50),
primerNombre varchar(60),
segundoNombre varchar(60),
primerApellido varchar(60),
segundoApellido varchar(60),
contrasena varchar(100),
correo varchar(50),
direccion varchar(30),
telefono varchar(20),
rool varchar(30),
activo boolean,
numUsuario varchar(20)
)
begin
INSERT INTO `akuavida`.`cuenta`
(`Tipo_Documento`,
`Numero_Documento`,
`Primer_Nombre`,
`Segundo_Nombre`,
`Primer_Apellido`,
`Segundo_Apellido`,
`Contraseña`,
`Correo`,
`Direccion`,
`Telefono`,
`Rool`,
`Activo`,
`Ususario_idUsusario`)
VALUES
(tipoDocumento,
numDocumento,
primerNombre,
segundoNombre,
primerApellido,
segundoApellido,
contrasena,
correo,
direccion,
telefono,
rool,
activo,
numUsuario);
end/

-- usuario

delimiter /
create procedure akuavida.insertUsuario(numUsuario varchar(200),
numPasword varchar(45),
rolU varchar(45),
estadoU varchar(45)
)
begin
INSERT INTO `akuavida`.`ususario`
(`idUsusario`,
`password`,
`rol`,
`estado`)
VALUES
(numUsuario,
numPasword,
rolU,
estadoU);
end/

-- domicilio

delimiter / 
create procedure akuavida.insertDomicilio(
numMunicipio varchar(200),
tipoDocumento varchar(10),
numDocumento varchar(50),
ciudad varchar(45),
direccion varchar(45),
telefono varchar(30)
)
begin
INSERT INTO `akuavida`.`domicilio`
(`Municipio_idMunicipio`,
`Cuenta_Tipo_Documento`,
`Cuenta_Numero_Documento`,
`Ciudad`,
`Direccion`,
`Telefono`)
VALUES
(numMunicipio,
tipoDocumento,
numDocumento,
ciudad,
direccion,
telefono);
end/

-- factura

delimiter /
create procedure akuavida.insertFactura(numFactura int,
fecha date,
tipoDocumento varchar(10),
numDocumento varchar(50)
)
begin
INSERT INTO `akuavida`.`factura`
(`ID_Factura`,
`Fecha`,
`Cuenta_Tipo_Documento`,
`Cuenta_Numero_Documento`)
VALUES
(numFactura,
fecha,
tipoDocumento,
numDocumento);
end/

-- pago

delimiter /
create procedure akuavida.insertPago(numFactura int,
tipoPago varchar(45),
numTarjeta varchar(100)
)
begin
INSERT INTO `akuavida`.`pago`
(`Factura_ID_Factura`,
`Tipo_Pago`,
`Numero_Tarjeta`)
VALUES
(numFactura,
tipoPago,
numTarjeta);
end/

-- pedido

delimiter /
create procedure akuavida.insertPedido(numFactura int,
fecha date,
subtotal float,
total float
)
begin
INSERT INTO `akuavida`.`pedido`
(`Factura_ID_Factura`,
`Fecha`,
`Subtotal`,
`Total`)
VALUES
(numFactura,
fecha,
subtotal,
total);
end/

-- item

delimiter /
create procedure akuavida.insertItem(numProducto varchar(200),
numFactura int,
cantidad int,
costoTotal float,
costoUnitario float
)
begin
INSERT INTO `akuavida`.`item`
(`Producto_ID_producto`,
`Pedido_Factura_ID_Factura`,
`Cantidad`,
`Costo_Total`,
`Costo_Unitario`)
VALUES
(numProducto,
numFactura,
cantidad,
costoTotal,
costoUnitario);
end/

-- item de carrito

delimiter /
create procedure akuavida.insertItemDeCarrito(numProducto varchar(200),
numCarrito int,
cantidad int,
costoUnitario float,
costoTotal float
) 
begin
INSERT INTO `akuavida`.`items_del_carrito`
(`Producto_ID_producto`,
`Carrito_De_Compras_ID_Carrito`,
`Cantidad`,
`Costo_Unitario`,
`Costo_Total`)
VALUES
(numProducto,
numCarrito,
cantidad,
costoUnitario,
costoTotal);
end/

-- inventario

delimiter /
create procedure akuavida.insertInventario(numInventario int,
cantidad int,
numProducto varchar(200),
cantidadProductoComprado float,
fechaDeCompra date
)
begin
INSERT INTO `akuavida`.`inventario`
(`ID_Inventario`,
`Cantidad`,
`Producto_ID_producto`,
`Cantidad_Producto_Comprado`,
`Fecha_De_Compra`)
VALUES
(numInventario,
cantidad,
numProducto,
cantidadProductoComprado,
fechaDeCompra);
end/

-- promociones

delimiter /
create procedure akuavida.insertPromocion(numPromocion varchar(200),
descuento float,
nombre varchar(60),
precio float,
numProducto varchar(200)
)
begin
INSERT INTO `akuavida`.`promociones`
(`Id_Promocion`,
`Descuentos`,
`Nombre`,
`Precio`,
`Producto_ID_producto`)
VALUES
(numPromocion,
descuento,
nombre,
precio,
numProducto);
end/














drop procedure akuavida.insertPromocion;