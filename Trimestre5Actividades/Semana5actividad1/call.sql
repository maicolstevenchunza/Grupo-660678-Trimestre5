-- producto

CALL `akuavida`.`insertProducto`('545646',
2,
'Acero',
420000,
load_file("C:/Imagenes/Koala.jpg"),
'acero alargado bonito',
5,
true,
1.16);

-- carrito de compras

CALL `akuavida`.`insertCarritoDeCompras`(3,
0, 
0);

-- categoria

CALL `akuavida`.`insertCategoria`(3,
'Purificador', 
1,
2);

-- usuario

CALL `akuavida`.`insertUsuario`('6',
'463547', 
'Cliente', 
'activo');

-- cuenta

CALL `akuavida`.`insertCuenta`('t.i',
'12345678923',
'Gina',
'Paola',
'Alfonso',
'Sarmiento',
'96543765', 
'maicol45op@gmail.com',
'Carrera 1 a # 78-17 sur', 
'7688011', 
'Cliente', 
1,
6);

-- domicilio

CALL `akuavida`.`insertDomicilio`('524', 
't.i', 
'12345678923', 
'Bogota',
'Carrera 1 a # 78-17 sur', 
'7688011');

-- factura

CALL `akuavida`.`insertFactura`(11, 
'2015-02-24', 
't.i', 
'12345678923');

-- pago

CALL `akuavida`.`insertPago`(11, 
'Tarjeta', 
'8765432190876543');

-- pedido

CALL `akuavida`.`insertPedido`(11, 
'2015-02-24', 
0, 
0);

-- item

CALL `akuavida`.`insertItem`('545646', 
11, 
11, 
0, 
420000);

-- item del carrito

CALL `akuavida`.`insertItemDeCarrito`(545646, 
3, 
11, 
420000, 
0);

-- inventario

CALL `akuavida`.`insertInventario`(6, 
10,
545646, 
8, 
'2015-02-24');

-- promocion

CALL `akuavida`.`insertPromocion`('6', 
16, 
'Dia del padre', 
380000, 
545646);











