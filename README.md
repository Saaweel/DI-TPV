# DI-POS
Aplicación del punto de venta (POS) de un bar como proyecto final del módulo Desarrollo de Interfaces del grado superior Desarrollo de Aplicaciones Multiplataforma.

# Changelog

- ### Version 0.1.2 (04/03/2024)
  - Funcionalidad de exportar el historial de mesas usando JasperReport
- ### Version 0.1.1 (04/03/2024)
  - *Botón* para exportar el historial de mesas usando JasperReport
- ### Version 0.0.9 (03/03/2024)
  - Exportar las facturas usando JasperReport
- ### Version 0.0.8 (02/03/2024)
  - Refront completo
- ### Version 0.0.7 (02/03/2024)
  - Cambiada la distribución de las mesas para que simulen el plano de un bar
- ### Version 0.0.6 (29/02/2024)
  - Cambiado el nombre del atributo _quantity_ de la clase `Product` a _amount_ y sus respectivos métodos
  - Persistencia de datos en base de datos MariaDB
- ### Version 0.0.5 (29/02/2024)
  - Eliminada la clase `Bill` y movida su funcionalidad a la clase `Table`
  - Añadidos botones de _Limpiar_, _Pagada_ y _Factura_ en las mesas
- ### Version 0.0.4 (27/02/2024)
  - Funcionalidad botón restar productos
  - Retirados 3 métodos innecesarios de la clase `Product`
- ### Version 0.0.3 (27/02/2024)
  - Listado de productos divididos en pestañas por categorías
  - Detalles de la cuenta de una mesa
- ### Version 0.0.2 (21/02/2024)
  - Creación de la estructura de la aplicación (Paquetería)
  - Creación de la pantalla principal con las mesas
  - Creación de la pantalla de la mesa
  - Creación de las clases `Table`, `Product` y `Bill` y sus métodos
  - Creación de un array temporal con todo el menú de productos
- ### Version 0.0.1 (20/02/2024)
  - Creación de la aplicación