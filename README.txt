# Challenge Conversor en Java 🚀

Este en un reto propuesto por Alura Latam para el desarrollo de habilidades y conocimientos adquiridos durante la capacitación de POO y adicionando interfaces visuales con java.

Este conversor te deja elegir entre 3 opciones:
  Conversor de divisas
  Conversor de unidades de medida
  Conversor de temperaturas
  
La única opción que trabaja diferente es el de divisas ya que utiliza Currency Data API para poder tener las divisas en tiempo real y no tener que actualizar manualmente cada uno de los valores.
En cuanto a el conversor de Unidades de medida y temperaturas si contiene sus propios valores predeterminados que no cambiaran.

## ¿Cómo funciona? 🚀
Tenemos 8 clases de Java y la principal(main) es MenuInterfaz, esta nos muestra las tres opciones de conversión donde nos puede llevar a la clase ConversorMonedas, ConversorMedida o ConversorTemperaturas. 
Una vez elejida clase, esta nos mostrara las opciones de conversion para esa categoria y posterior a seleccionar, se nos mostrara una ventana que nos pedira el valor que queremos convertir, este lo genera la clase PedirValor que es llamado por la clase Operaciones.
Laa clase Operaciones recibe el valor que obtuvo la clase PedirValor para poder realizar el cálculo requerido.
Finalmente, la clase MostrarResultado es llamada por cualquier funcion que haya generado esa respuesta y se muestra con una ventana, una vez aceptemos, nos mostrara de la clase Continuar si queremos seguir con la operación, si aceptamos nos mandara a la clase MenuInterfaz


### Dificultades 🚀
Al no conocer de interfaces digitales en Java tuve que acudir a diferentes libros, me guie finalmente con el libro de Cómo programar en Java de DEITEL
De igual manera no conocía del manejo de API's finalmente después de leer la documentación y buscando por diferentes sitios y videos de YouTube logre realizar la conexión con la API y establecer los valores según cada función.
Al ser un proyecto con varias clases, se me hacía complicado unirlas, pero recordando lo que había visto en mi preparación por parte de Alura logre agilizar el proceso y ordenar todo de manera adecuada.
El proyecto me llevo dos días por lo que la planeación y la ejecución no hayan sido bien realizadas, pero se cumple con el objetivo y el sistema funciona de manera correcta.
