CREATE TABLE reporte(
	id_reporte Long primary key,
    nombre varchar(250),
    nota varchar(250),
    fecha date,
    cantidad varchar(250),
    motivacion varchar(250),
    satisfaccion varchar(250)
);



    @Column(name = "motivacion") //=> ID
    private String motivacion;

    @Column(name = "satisfaccion") //=> ID
    private String satisfaccion;


    @Column(name = "cantidad") //=> ID
    private String cantidad;

