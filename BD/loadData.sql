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
    ('Doctorado en Ciencias de la Ingeniería con Mención Informática, Universidad de Santiago de Chile.'),
    ('Ingeniero Biomédico, Universidad de Valparaíso.'),
    ('Doctor en Ciencias de la Ingeniería con mención en Informática, Universidad de Santiago de Chile.'),
    ('Magíster en Ingeniería Informática, Universidad de Santiago de Chile.'),
    ('PhD in Communication, Information, and Library Studies, Rutgers University.'),
    ('Magíster en Seguridad de la Información de la Universidad Central.'),
    ('Magíster en Ciencias de la Computación, Universidad de Chile.'),
    ('Ingeniero Civil en Computación, Universidad de Chile.'),
    ('Ingeniero Civil, Universidad de Chile'),
    ('Ingeniero Civil Electricista mención en Telecomunicaciones, Universidad de Santiago de Chile.'),
    ('Ingeniero Civil Informático, Universidad de Santiago de Chile.'),
    ('Ingeniero de Ejecución en Computación e Informática, Universidad de Magallanes.');



--DIPLOMADOS
insert into diplomado (titulo,introduccion,objetivo,descripcion,horas,cursos,imagen) values 
    -- Número 1
    ('Ciencia de Datos Aplicada',NULL,
    -- Objetivo
    'El programa tiene como objetivo general formar especialistas que sean capaces de aplicar las  técnicas y herramientas de análisis de datos, con rigurosidad y ética, con el fin de mejorar de procesos para la toma de decisiones en diversas áreas de desempeño profesional.',
    -- Descripción
    'El Diplomado en ciencia de datos aplicada entrega los conocimientos necesarios en el uso de técnicas y herramientas de análisis de datos, con el fin de mejorar procesos de tomas de decisiones en diversas áreas de desempeño profesional.

El programa busca por medio de un enfoque aplicado generar habilidades de programación, exploración y modelamiento de datos, finalizando con un proyecto práctico en donde se aplican los conocimientos y herramientas vistas, buscando dar solución a problemáticas mediante la ciencia de datos.

El diplomado está estructurado en 6 módulos y tiene una duración de 180 horas cronológicas con 120 horas de docencia directa.',
    -- Horas, cursos e imagen
    180,6,NULL),


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
    105,7,NULL),


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
    108,9,NULL
    ),
    

    -- Número 4
    ('Control, Seguridad y Auditoría Computacional', NULL,
    --Objetivo
    'Proporcionar a informáticos y auditores conocimientos que le permitan realizar actividades de auditoría computacional y enfrentar problemas de seguridad de sistemas.',
    --Descripcion
    'El diplomado desarrolla metodologías , procedimientos y técnicas que permitan auditar y mejorar a los estudiantes en la definición de políticas, construcción de planes y establecer criterios para una adecuada gestión de la seguridad informática en las organizaciones. Adicionalmente, el diplomado se enfoca en evaluar los riesgos que existen en la aplicación de las tecnologías de la información. Finalmente se abordan procedimientos y controles que permitan disminuir o evitar el impacto de los riesgos.',
    -- Horas, cursos e imagen
    120,10,NULL
),
     -- Número 5
    ('Peritaje Informático',NULL,NULL,
    --Descripcion
    'El Diplomado está dirigido a abogados, ingenieros informáticos, auditores y oficiales de la Fuerzas Armadas o de Orden.

Este diplomado tiene como objetivo preparar a profesionales relacionados con los procesos de la reforma al sistema de justicia nacional en temas informáticos que les permitan afrontar, con conocimientos adecuados, las exigencias de esta nueva disciplina en el ámbito legislativo, judicial y policial.

El programa contempla en su desarrollo, clases, magistrales, casos prácticos como teóricos, disertaciones, trabajos grupales, trabajos individuales, aplicaciones a una realidad concreta y pruebas.',
    192,16,NULL);

--DOCENTE
insert into docente (nombre,id_rol_docente) values 
    ('Greyson Marquez',1),
    ('Veronika Nielsen',1),
    ('Jae Hines',2),
    ('Heena Wickens',2),
    ('Haya Berry',3),
    ('Milo Bostock', 3),
    ('Callum Howarth', 2),
    ('Samia Barnes', 3),
    ('Sneha Hays', 1),
    ('Teodor Levine',3);


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

--DIPLOMADO_DOCENTE
insert into diplomado_docente (id_docente,id_diplomado) values 
    (1,1),
    (2,1),
    (3,1),
    (4,3),
    (5,4),
    (6,5),
    (7,1),
    (8,2),
    (9,3),
    (10,1);

--DOCENTE_TITULO
insert into docente_titulo (id_docente,id_titulo) values 
    (1,1),
    (2,9),
    (3,2),
    (4,3),
    (5,4),
    (6,5),
    (7,7),
    (8,6),
    (9,8),
    (10,1),
    (1,2),
    (2,3);
    