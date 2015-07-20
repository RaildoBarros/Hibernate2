-- =============================================================================
-- Diagram Name: der
-- Created on: 15/7/2015 21:29:40
-- Diagram Version: 
-- =============================================================================


CREATE TABLE "estado" (
	"codigo" SERIAL NOT NULL,
	"descricao" varchar,
  PRIMARY KEY("codigo")
);


CREATE TABLE "cliente" (
	"codigo" SERIAL NOT NULL,
	"nome" varchar,
	"datanascimento" date,
	"codestado" int4,
  PRIMARY KEY("codigo")
);


CREATE TABLE "endereco" (
	"codigo" SERIAL NOT NULL,
	"rua" varchar,
	"codcliente" int4,
  PRIMARY KEY("codigo")
);



ALTER TABLE "cliente" ADD CONSTRAINT "Ref_cliente_to_estado" FOREIGN KEY ("codestado")
	REFERENCES "estado"("codigo")
	MATCH SIMPLE
	ON DELETE NO ACTION
	ON UPDATE NO ACTION
	NOT DEFERRABLE;

ALTER TABLE "endereco" ADD CONSTRAINT "Ref_endereco_to_cliente" FOREIGN KEY ("codcliente")
	REFERENCES "cliente"("codigo")
	MATCH SIMPLE
	ON DELETE NO ACTION
	ON UPDATE NO ACTION
	NOT DEFERRABLE;


