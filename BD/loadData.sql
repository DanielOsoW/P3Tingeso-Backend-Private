--POSTULANTE
insert into postulante (nombre,correo,num_telefono) values 
    ('Francesco Wolf', 'fenrico0@ifeng.com','+56912001611'),
    ('Kathy Buchanan', 'hpowelee1@mlb.com','+56958793164'),
    ('Esmai Williams', 'wkennelly2@e-recht24.de','+56965833570'),
    ('Ayush Needham', 'llarway3@europa.eu','+56990901212'),
    ('Elaina Alfaro', 'ehorsell4@miibeian.gov.cn','+56973558337'),
    ('Alesha Hunt', 'ncoshoot5@google.es','+56944100694'),
    ('Zara Clifford', 'bivakhno6@wiley.com','+56951081082'),
    ('Emelia Phan', 'asollime7@reference.com','+56903450706'),
    ('Lynsey Dale', 'bfazzioli8@facebook.com','+56940414825'),
    ('Tori Magana', 'pdechastelain9@aol.com','+56995391409');

--ROL
insert into rol (descripcion) values 
    ('Admin'),
    ('Secretary'),
    ('Teacher');


--ROL_DOCENTE
insert into rol_docente (descripcion) values 
    ('Coordinador'),
    ('Academico'),
    ('Profesional');

--TITULO
insert into titulo (nombre) values 
    ('Doctorado en Ciencias de la Ingeniería con Mención Informática, Universidad de Santiago de Chile.'), --Manu Felipe
    ('Ingeniero Biomédico, Universidad de Valparaíso.'), --2 Manu
    ('Magíster en Ingeniería Informática, Universidad de Santiago de Chile.'), -- 3 Felipe Mario Robert
    ('Ingeniero Civil Informático, Universidad de Santiago de Chile.'),--4 Felipe Mario Robert Lobos 
    ('PhD in Computer Science, Universidad Complutense de Madrid.'),  --Caro 
    ('Magíster en Ciencias de la Computación, Universidad de Chile.'), --6 --Caro Mauri
    ('Ingeniero de Ejecución en Computación e Informática, Universidad de Magallanes.'), --7 Caro
    ('Doctor en Ciencias de la Computación, Universidad de Concepción..'), --8 Diego 
    ('Ingeniero Civil Informático, Universidad de Concepción.'),--9 Diego 
    ('PhD in Computer Science, The University of Newcastle.'),-- 10 Mario
    ('PhD in Computer Science, University of Oxford.'), --11 Mauri
    ('Ingeniero de Ejecución en Electricidad, Universidad de Magallanes. '),--12 Mauri
    ('PhD in Communication, Information, and Library Studies, Rutgers University.'), --13 Robert
    ('Magíster en Seguridad de la Información de la Universidad Central.'), --14 Eric
    ('Ingeniero Civil en Computación, Universidad de Chile.'),--15 Eric
    ('Magíster en Negocios, Universidad Adolfo Ibañez'), --16 Andres
    ('Postítulo en Derecho Informático y de las Telecomunicaciones, Universidad de Chile'), --17 Andres
    ('Abogado, Universidad Adolfo Ibáñez'), --18 Andres
    ('Magíster en Seguridad, Peritaje y Auditoría en Procesos Informáticos, Universidad de Santiago'), --19 Daniel Juanrorro
    ('Instructor Trainer, Cisco Networking Academy'), --20 Daniel
    ('Ingeniero en Telecomunicaciones, Inacap'), --21 Daniel
    ('Ingeniero Civil, Universidad de Chile'), --22 Arturo
    ('Diplomado en Gestión y Marketing, Universidad Adolfo Ibáñez.'), --23 Arturo 
    ('Magíster en Tecnologías de la Informacíón, Universidad Técnica Federico Santa María.'), --24 Gonza
    ('Ingeniero Civil Electricista mención en Telecomunicaciones, Universidad de Santiago de Chile.'), --25 Gonza 
    ('Diplomado en Control, Seguridad y Auditoría Informática. Universidad de Santiago de Chile.'), --26 Juanrorro  Waldo georgy Armando 
    ('Diplomado en Peritaje Informático. Universidad de Santiago de Chile.'), --27 Juanrorro Waldo  georgy
    ('Licenciado en Ciencias de la Ingeniería. Universidad de las Américas.'), --28 Juanrorro
    ('Ingeniero de Ejecución en Informática. Universidad de las Américas.'), --29 Juanrorro
    ('Abogado, Universidad de Chile.'), --30 Ossa
    ('Diplomado en Estado de Derecho y Reformas a la Justicia, Universidad de Chile.'), --31 Ossa
    ('Ingeniero de Ejecución Industrial, Universidad Andrés Bello.'), --32 Waldo 
    ('Ingeniero en Gestión de Empresas, Universidad Diego Portales.'), --33 Waldo 
    ('Ingeniero Electrónico y de Telecomunicaciones, Universidad San Martín – Colombia'), --34 Julián 
    ('CISA (Certified Information Systems Auditor)'), --35 Julián 
    ('CRISC (Certified Risk in Information Systems and Controls)'), --36 Julián 
    ('Perito Informático, Academia Superior de Estudios Policiales, Policía de Investigaciones de Chile.'), --37 Felipe
    ('Diplomado en Criminalística y Metodología Forense, Universidad de Valparaíso.'), --38 Felipe
    ('Ingeniero Comercial, mención Informática, Universidad de Santiago de Chile.'), --39 georgy
    ('Licenciado en Ciencias Jurídicas y Sociales, Universidad Las Condes. Título de Abogado.'), --40 Marcelo 
    ('Magíster en Derecho Público con Mención en Derecho Constitucional, Universidad Católica de Chile.'), --41 Marcelo 
    ('Diplomado en Auditoría de Sistemas, Universidad de Chile.'), --42 Lobos 
    ('Diplomado en Seguridad Computacional, Universidad de Chile.'), --43 Lobos 
    ('Licenciado en Ciencias de la Investigación Criminalística, Academia Superior de Ciencias Policiales, PDI.'), --44 Armando 
    ('Creador y ex jefe de la Brigada Investigadora del Ciber Crimen (Bricib) de la PDI.'), --45 Armando 
    ('Prefecto ® de la Policía de Investigaciones de Chile.'), --46 Armando 
    ('Licenciado en Comunicación Publicitaria, Mención Gestión Creativa, Universidad de Santiago de Chile.'), --47 Armando 
    ('Magíster en Didáctica para la Educación Superior, Universidad de Tarapacá.'), --48 Armando 
    ('Doctor en Comunicación, Universidad de Artes, Ciencias y Comunicación.') --49 Armando 
    ;



--DIPLOMADOS
insert into diplomado (titulo,introduccion,objetivo,descripcion,horas,cursos,imagen,arancel) values 
    -- Número 1
    ('Ciencia de Datos Aplicada',NULL,
    -- Objetivo
    'El programa tiene como objetivo general formar especialistas que sean capaces de aplicar las  técnicas y herramientas de análisis de datos, con rigurosidad y ética, con el fin de mejorar de procesos para la toma de decisiones en diversas áreas de desempeño profesional.',
    -- Descripción
    'El Diplomado en ciencia de datos aplicada entrega los conocimientos necesarios en el uso de técnicas y herramientas de análisis de datos, con el fin de mejorar procesos de tomas de decisiones en diversas áreas de desempeño profesional.

El programa busca por medio de un enfoque aplicado generar habilidades de programación, exploración y modelamiento de datos, finalizando con un proyecto práctico en donde se aplican los conocimientos y herramientas vistas, buscando dar solución a problemáticas mediante la ciencia de datos.

El diplomado está estructurado en 6 módulos y tiene una duración de 180 horas cronológicas con 120 horas de docencia directa.',
    -- Horas, cursos e imagen
    180,6,NULL,2900000),


    -- Número 2
    ('Ciberseguridad (Gestión,Técnico y Legal)',
    -- Introducción
    'El Diplomado en Ciberseguridad entrega una visión integrada de lo que significa la Ciberseguridad para una organización en sus ámbitos técnico, gestión y legal. Este programa permitirá a los participantes diseñar, implementar y aplicar técnicas y herramientas de ciberseguridad y hacking ético que permitan proteger, monitorear, mantener y administrar la infraestructura TI y la información dentro de la organización. Además, les permitirá conocer y aplicar buenas prácticas para gestionar, definir y documentar políticas y riesgos de ciberseguridad para la compañía.
    
Finalmente permitirá que los participantes logren entender, evaluar y aplicar las normativas legales aplicables a Ciberseguridad en la organización.',
    -- Objetivo 
    'Contribuir al desarrollo y mejora de la Ciberseguridad, en aspectos de gestión, de técnicas y de cuestiones legales, en organizaciones públicas y privadas del país, mediante la formación y especialización de las y los profesionales partícipes de los distintos procesos de TICs, permitiendo con ello aportar para tener organizaciones seguras y resilentes frente a riesgos y amenazas de ciberataques internos y externos.',
    -- Descripción
    NULL,
    -- Horas, cursos e imagen
    105,7,NULL,3150000),


    -- Número 3
    ('Riesgo Operacional y Continuidad del Negocio en Procesos TICs',
    -- Introducción
    'El riesgo es definido por la RAE como la “Contingencia o proximidad de un daño”. Este concepto se encuentra presente en múltiples aspectos de la vida diaria de las personas y empresas. La posibilidad de que algo dañino suceda es permanente y puede afectar directamente, por ejemplo, su rendimiento financiero y la infraestructura tecnológica. Por lo tanto, la necesidad de vigilar y controlar los riesgos se vuelve evidente y prioritario. 

En las organizaciones y empresas, especialmente del rubro financiero, el tipo de riesgo operacional ha tomado especial relevancia en los últimos años. Este es definido por el Comité de Basilea como riesgo de pérdida resultante de inadecuados o fallidos procesos internos, de las personas y de los sistemas, como también de acontecimientos externos”. Esta definición considera tanto el riesgo financiero como el tecnológico, siendo este último, de especial relevancia, dado que las empresas son cada vez más dependientes de una infraestructura tecnológica para alcanzar sus objetivos de negocio.
    
La desregulación y la globalización de los servicios financieros, junto con la creciente sofisticación de la tecnología, han creado una variedad de nuevos riesgos para todo tipo de organizaciones. Estos se han enfrentado con nuevas regulaciones (PCI/DSS, SOX, HIPAA), normativas (Basilea III, Solvencia), Leyes (Ley 19799, Ley 19628) y estándares (ISO 31000, ISO 22301, ISO 27000, ISO 20000). Los encargados de las áreas relacionadas deben ser capaces de enfrentar estos riesgos utilizando estas nuevas herramientas.',
    --Objetivo
    'Comprender, analizar y aplicar los conceptos asociados al Riesgo Operacional, así como la Gestión de Continuidad del Negocio y de sus componentes principales (BCP y DRP) enfocado en los procesos críticos del negocio y las TIC que apoyan dichos procesos.',
    --Descripcion
    NULL ,
    -- Horas, cursos e imagen
    108,9,NULL,2745000
    ),
    

    -- Número 4
    ('Control, Seguridad y Auditoría Computacional', NULL,
    --Objetivo
    'Proporcionar a informáticos y auditores conocimientos que le permitan realizar actividades de auditoría computacional y enfrentar problemas de seguridad de sistemas.',
    --Descripcion
    'El diplomado desarrolla metodologías , procedimientos y técnicas que permitan auditar y mejorar a los estudiantes en la definición de políticas, construcción de planes y establecer criterios para una adecuada gestión de la seguridad informática en las organizaciones. Adicionalmente, el diplomado se enfoca en evaluar los riesgos que existen en la aplicación de las tecnologías de la información. Finalmente se abordan procedimientos y controles que permitan disminuir o evitar el impacto de los riesgos.',
    -- Horas, cursos e imagen
    120,10,NULL,2680000 
),
     -- Número 5
    ('Peritaje Informático',NULL,NULL,
    --Descripcion
    'El Diplomado está dirigido a abogados, ingenieros informáticos, auditores y oficiales de la Fuerzas Armadas o de Orden.

Este diplomado tiene como objetivo preparar a profesionales relacionados con los procesos de la reforma al sistema de justicia nacional en temas informáticos que les permitan afrontar, con conocimientos adecuados, las exigencias de esta nueva disciplina en el ámbito legislativo, judicial y policial.

El programa contempla en su desarrollo, clases, magistrales, casos prácticos como teóricos, disertaciones, trabajos grupales, trabajos individuales, aplicaciones a una realidad concreta y pruebas.',
    192,16,NULL,3861000);

--DOCENTE
insert into docente (nombre,id_rol_docente) values 
    ('Alcides Quispes',1),
    -- Primer diplomado
    ('Manuel Villalobos-Cid',1),
    ('Felipe-Andrés Bello Robles',1),
    ('Carolina Bonacic Castro',2),
    ('Diego Caro Alarcón',2),
    ('Mario Inostroza Ponta',3),
    ('Mauricio Marín Caihuán', 3),
    ('Roberto González Ibáñez', 2), --8
    -- Segundo diplomado
    ('Eric Donders', 3), --9
    ('Andrés Pumarino',1),
    ('Daniel Pacheco Pacheco', 1),
    ('Arturo Terra',3),--12
    -- Tercer diplomado
    ('Gonzalo Concha',1),--13
    -- Cuarto diplomado
    ('Juan Rodrigo Anabalón',1),--14
    ('Claudio Ossa Rojas',2),
    ('Waldo Gómez Román',2),
    ('Julián Márquez López',3),--17
    -- Quinto diplomado
    ('Felipe Sánchez Fabres',1),--18
    ('Gregorio Zaviezo',2),
    ('Marcelo Huerta Miranda',2),
    ('Carlos Lobos Medina',2),
    ('Armando Muñoz Moreno',2)--22

    ;

--Diplomado-DOCENTE
insert into diplomado_docente(id_diplomado,id_docente,coordinador) values 
    -- Primer diplomado
    (1,2,TRUE),
    (1,3,false),
    (1,4,false),
    (1,5,false),
    (1,6,false),
    (1,7,false),
    (1,8,false),
    -- Segundo diplomado
    (2,1,TRUE),
    (2,9,false),
    (2,10,false),
    (2,11,false),
    (2,12,false),
    -- Tercer diplomado
    (3,1,TRUE),
    (3,9,false),
    (3,12,false),
    (3,13,false),
    -- Cuarto diplomado
    (4,1,TRUE),
    (4,14,false),
    (4,15,false),
    (4,16,false),
    (4,17,false),
    -- Quinto diplomado
    (5,1,TRUE),
    (5,15,false),
    (5,16,false),
    (5,18,false),
    (5,19,false),
    (5,20,false),
    (5,21,false),
    (5,22,false);

--CARTA
insert into carta (descripcion,id_docente,id_postulante) values 
    ('Aceptado',1,1),
    ('Rechazado',2,2),
    ('En espera',2,3),
    ('En espera',1,4),
    ('Aceptado',6,5),
    ('Aceptado',1,6),
    ('Rechazado',3,7),
    ('Aceptado',2,8),
    ('En Espera',2,9),
    ('Aceptado',1,10);

--POSTULACION
insert into postulacion (comentario,src_doc,id_postulante,id_diplomado) values 
    ('sadgsadhgash',null,1,1),
    ('ewrgfv',null,2,1),
    ('adfhzxcvb',null,3,1),
    ('cvxnb',null,4,3),
    ('32547whfs',null,5,4),
    ('adsfhadfh',null,6,5),
    ('asy53df',null,7,1),
    ('asdfhgv',null,8,2),
    ('qwygh',null,9,3),
    ('shnafdh',null,10,1),
    ('qryfhsd',null,1,1),
    ('qewry5247',null,2,3);


--INFORMACION
insert into informacion (nombre,contenido,id_diplomado) values 
    ('Aranceles','-El valor total del diplomado asciende a $2.900.000 (valor año 2021, 1° Semestre).\n
      -Derecho de inscripción por un valor de $63.000.\n
      -Este diplomado no está adscrito a código SENCE.\n
      -Este diplomado no está adscrito a convenio marco.',1);

--USUARIO
insert into usuario (email,password,id_docente,id_rol) values 
    ('a@a.a','a',1,1),
    ('Veronika@mlb.com','a',2,1),
    ('Jae@e-recht24.de','a',3,1),
    ('Heena@europa.eu','a',4,2),
    ('Haya@miibeian.gov.cn','a',5,1),
    ('Milo@google.es','a',6,3),
    ('Samia@wiley.com','a',7,1),
    ('Teodor@reference.com','a',8,3),
    ('Sneha@facebook.com','a',9,2),
    ('Teodor@aol.com','a',10,2);

--DOCENTE_TITULO
insert into docente_titulo (id_docente,id_titulo) values 
    -- Manuel Villalobos-Cid id : 2
    (2,1),
    (2,2),
    -- Felipe-Andrés Bello Robles  id : 3
    (3,1),
    (3,3),
    (3,4),
    -- Carolina Bonacic Castro id : 4
    (4,5),
    (4,6),
    (4,7),
    -- Diego Caro Alarcón id : 5
    (5,8),
    (5,9),    
    -- Mario Inostroza Ponta id : 6
    (6,10),
    (6,3),
    (6,4),
    -- Mauricio Marín Caihuán
    (7,11),
    (7,6),
    (7,12),
    -- Roberto González Ibáñez
    (8,13),
    (8,3),
    (8,4),
    --SEGUNDO DIPLOMADO
    
    -- Eric Donders
    (9,14),
    (9,15),
    -- Andrés Pumarino
    (10,16),
    (10,17),
    (10,18),
    -- Daniel Pacheco Pacheco
    (11,19),
    (11,20),
    (11,21),
    -- Arturo Terra
    (12,22),
    (12,23),
    --TERCER DIPLOMADO

     -- Gonzalo Concha
    (13,24),
    (13,25),
    --CUARTO DIPLOMADO
    
    -- Juan Rodrigo Anabalón
    (14,19),
    (14,26),
    (14,27),
    (14,28),      
    (14,29),
    -- Claudio Ossa Rojas
    (15,30),
    (15,31),
    -- Waldo Gómez Román
    (16,32),
    (16,33),
    (16,26),
    (16,27),
    -- Julián Márquez López
    (17,34),
    (17,35),
    (17,36),

    -- Quinto diplomado

    -- Felipe Sánchez Fabres
    (18,7),
    (18,26),
    (18,27),
    (18,37),
    (18,38),
    -- Gregorio Zaviezo
    (19,39),
    (19,26),
    (19,27),
    -- Marcelo Huerta Miranda
    (20,40),
    (20,41),
    -- Carlos Lobos Medina
    (21,4),
    (21,42),
    (21,43),
    -- Armando Muñoz Moreno
    (22,44),
    (22,45),
    (22,46),
    (22,26),
    (22,47),
    (22,48),
    (22,49)
  ;
    