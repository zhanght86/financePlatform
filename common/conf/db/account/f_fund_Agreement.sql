CREATE TABLE f_fund_agreement
(
  id bigint NOT NULL,
  customer_id character varying(30),
  fund_company_id character varying(100) NOT NULL,
  create_time timestamp without time zone,
  update_time timestamp without time zone,
  CONSTRAINT pk_f_fund_agreement PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);