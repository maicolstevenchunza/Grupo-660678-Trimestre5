

UPDATE akuavida.item m
SET
m.Costo_Total= m.Costo_Unitario*m.Cantidad 
WHERE  m.Pedido_Factura_ID_Factura = 1;

UPDATE akuavida.item m
SET
m.Costo_Total= m.Costo_Unitario*m.Cantidad 
WHERE  m.Pedido_Factura_ID_Factura = 2;

UPDATE akuavida.item m
SET
m.Costo_Total= m.Costo_Unitario*m.Cantidad 
WHERE  m.Pedido_Factura_ID_Factura = 3;

UPDATE akuavida.item m
SET
m.Costo_Total= m.Costo_Unitario*m.Cantidad 
WHERE  m.Pedido_Factura_ID_Factura = 4;

UPDATE akuavida.item m
SET
m.Costo_Total= m.Costo_Unitario*m.Cantidad 
WHERE  m.Pedido_Factura_ID_Factura = 5;

UPDATE akuavida.item m
SET
m.Costo_Total= m.Costo_Unitario*m.Cantidad 
WHERE  m.Pedido_Factura_ID_Factura = 6;

UPDATE akuavida.item m
SET
m.Costo_Total= m.Costo_Unitario*m.Cantidad 
WHERE  m.Pedido_Factura_ID_Factura = 7;

UPDATE akuavida.item m
SET
m.Costo_Total= m.Costo_Unitario*m.Cantidad 
WHERE  m.Pedido_Factura_ID_Factura = 8;

UPDATE akuavida.item m
SET
m.Costo_Total= m.Costo_Unitario*m.Cantidad 
WHERE  m.Pedido_Factura_ID_Factura = 9;

UPDATE akuavida.item m
SET
m.Costo_Total= m.Costo_Unitario*m.Cantidad 
WHERE  m.Pedido_Factura_ID_Factura = 10;

select count(*)  from akuavida.item t where t.Pedido_Factura_ID_Factura=1;

select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=1;

-- actualia el subtotal y totaL del pedido

UPDATE `akuavida`.`pedido`
SET
`Subtotal` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=1)*0.16,
`Total` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=1)*1.16
WHERE `Factura_ID_Factura` = 1;

UPDATE `akuavida`.`pedido`
SET
`Subtotal` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=2)*0.16,
`Total` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=2)*1.16
WHERE `Factura_ID_Factura` = 2;

UPDATE `akuavida`.`pedido`
SET
`Subtotal` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=3)*0.16,
`Total` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=3)*1.16
WHERE `Factura_ID_Factura` = 3;

UPDATE `akuavida`.`pedido`
SET
`Subtotal` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=4)*0.16,
`Total` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=4)*1.16
WHERE `Factura_ID_Factura` = 4;

UPDATE `akuavida`.`pedido`
SET
`Subtotal` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=5)*0.16,
`Total` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=5)*1.16
WHERE `Factura_ID_Factura` = 5;

UPDATE `akuavida`.`pedido`
SET
`Subtotal` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=6)*0.16,
`Total` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=6)*1.16
WHERE `Factura_ID_Factura` = 6;

UPDATE `akuavida`.`pedido`
SET
`Subtotal` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=7)*0.16,
`Total` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=7)*1.16
WHERE `Factura_ID_Factura` = 7;

UPDATE `akuavida`.`pedido`
SET
`Subtotal` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=8)*0.16,
`Total` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=8)*1.16
WHERE `Factura_ID_Factura` = 8;

UPDATE `akuavida`.`pedido`
SET
`Subtotal` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=9)*0.16,
`Total` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=9)*1.16
WHERE `Factura_ID_Factura` = 9;

UPDATE `akuavida`.`pedido`
SET
`Subtotal` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=10)*0.16,
`Total` = (select sum(a.Costo_Total) from akuavida.item a where a.Pedido_Factura_ID_Factura=10)*1.16
WHERE `Factura_ID_Factura` = 10;

UPDATE `akuavida`.`factura`
SET
`Total` = (select a.Total from akuavida.pedido a where a.Pedido_Factura_ID_Factura=10)*1.16
WHERE `Factura_ID_Factura` = 10;

-- joins 

select it.Cantidad, p.Nombre, it.Costo_Unitario, it.Costo_Total from akuavida.producto p, akuavida.pedido pe, akuavida.factura fa, akuavida.item it
where fa.ID_Factura=pe.Factura_ID_Factura and pe.Factura_ID_Factura=it.Pedido_Factura_ID_Factura and it.Producto_ID_producto=p.ID_producto and fa.ID_Factura;

select cu.Primer_Nombre, dom.Direccion, dom.Telefono  from akuavida.municipio mu, akuavida.domicilio dom, akuavida.cuenta cu, akuavida.factura fa
where mu.idMunicipio=dom.Municipio_idMunicipio and dom.Cuenta_Tipo_Documento=cu.Tipo_Documento and dom.Cuenta_Numero_Documento=cu.Numero_Documento and fa.Cuenta_Tipo_Documento=cu.Tipo_Documento and fa.Cuenta_Numero_Documento=cu.Numero_Documento;
