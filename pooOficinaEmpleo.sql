CREATE TABLE Usuario(
id_usuarios int not null auto_increment,
nombreUsuarios nvarchar(50),
contraseña nvarchar(50),
nombre nvarchar(50),
apellido nvarchar(50),
fecha date,
primary key(id_usuarios));

CREATE TABlE AbstractPersonas(
id_personas int not null auto_increment,
id_usuarios int not null,
nombre nvarchar(50),
cuil_cuit int,
domicilio nvarchar(50),
telPrincipal int,
telAlternativo int,
email nvarchar(50),
primary key(id_personas),
foreign key(id_usuarios) references Usuario(id_usuarios));

CREATE TABLE TipoActividad(
id_tipo_actividad int not null auto_increment,
id_usuarios int not null,
nombre nvarchar(50),
descripcion nvarchar(100),
primary key(id_tipo_actividad),
foreign key(id_usuarios) references Usuario(id_usuarios));


CREATE TABLE Empresa(
id_empresa int not null auto_increment,
id_personas int not null,
id_tipo_actividad int not null,
id_usuarios int not null,
razonSocial nvarchar(50),
representanteLegal nvarchar(50),
sede nvarchar(50),
cantidadTrabajadores int,
fechaContacto date,
tipoContacto nvarchar(50),
primary key(id_empresa),
foreign key(id_personas) references AbstractPersonas(id_personas),
foreign key(id_usuarios) references Usuario(id_usuarios),
foreign key(id_tipo_actividad) references TipoActividad(id_tipo_actividad));


CREATE TABLE NivelEducacion(
id_nivel_educacion int not null auto_increment,
id_usuarios int not null,
nombre nvarchar(50),
descripcion nvarchar(50),
primary key(id_nivel_educacion),
foreign key(id_usuarios) references Usuario(id_usuarios));

CREATE Table Programa(
id_usuarios int not null,
id_programa int not null auto_increment,
nombre nvarchar(50),
descripcion nvarchar(50),
primary key(id_programa),
foreign key(id_usuarios) references Usuario(id_usuarios));

CREATE TABLE Perfil(
id_perfil int not null auto_increment,
id_usuarios int not null,
nombre nvarchar(50),
descripcion nvarchar(50),
primary key(id_perfil),
foreign key(id_usuarios) references Usuario(id_usuarios));

CREATE TABLE Postulante(
id_postulante int not null auto_increment,
id_perfil int not null,
id_nivel_educacion int not null,
id_programa int not null,
id_usuarios int not null,
apellido nvarchar(50),
dni int,
edad int,
sexo nvarchar(50),
movilidad nvarchar(50),
dispHoraria nvarchar(50),
docAdicional nvarchar(50),
primary key(id_postulante),
foreign key(id_perfil) references Perfil(id_perfil),
foreign key(id_nivel_educacion) references NivelEducacion(id_nivel_educacion),
foreign key(id_usuarios) references Usuario(id_usuarios),
foreign key(id_programa) references Programa(id_programa));

CREATE TABLE Curriculum(
id_curriculum int not null auto_increment,
id_postulante int not null,
id_usuarios int not null,
cursos nvarchar(50),
experienciaLaboral nvarchar(50),
primary key(id_curriculum),
foreign key(id_usuarios) references Usuario(id_usuarios),
foreign key(id_postulante) references Postulante(id_postulante));




