--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.2
-- Dumped by pg_dump version 9.6.2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: ironcards; Type: DATABASE; Schema: -; Owner: forestnewark
--

CREATE DATABASE ironcards WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'en_US.UTF-8' LC_CTYPE = 'en_US.UTF-8';


ALTER DATABASE ironcards OWNER TO forestnewark;

\connect ironcards

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: assignment; Type: TABLE; Schema: public; Owner: forestnewark
--

CREATE TABLE assignment (
    assignmentid integer NOT NULL,
    name character varying(40) NOT NULL,
    "time" integer NOT NULL,
    points integer NOT NULL,
    column_5 integer
);


ALTER TABLE assignment OWNER TO forestnewark;

--
-- Name: assignment_assignmentid_seq; Type: SEQUENCE; Schema: public; Owner: forestnewark
--

CREATE SEQUENCE assignment_assignmentid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE assignment_assignmentid_seq OWNER TO forestnewark;

--
-- Name: assignment_assignmentid_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: forestnewark
--

ALTER SEQUENCE assignment_assignmentid_seq OWNED BY assignment.assignmentid;


--
-- Name: questions; Type: TABLE; Schema: public; Owner: forestnewark
--

CREATE TABLE questions (
    questionid integer NOT NULL,
    question character varying(100) NOT NULL,
    answer character varying(1) NOT NULL
);


ALTER TABLE questions OWNER TO forestnewark;

--
-- Name: questions_questionid_seq; Type: SEQUENCE; Schema: public; Owner: forestnewark
--

CREATE SEQUENCE questions_questionid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE questions_questionid_seq OWNER TO forestnewark;

--
-- Name: questions_questionid_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: forestnewark
--

ALTER SEQUENCE questions_questionid_seq OWNED BY questions.questionid;


--
-- Name: assignment assignmentid; Type: DEFAULT; Schema: public; Owner: forestnewark
--

ALTER TABLE ONLY assignment ALTER COLUMN assignmentid SET DEFAULT nextval('assignment_assignmentid_seq'::regclass);


--
-- Name: questions questionid; Type: DEFAULT; Schema: public; Owner: forestnewark
--

ALTER TABLE ONLY questions ALTER COLUMN questionid SET DEFAULT nextval('questions_questionid_seq'::regclass);


--
-- Data for Name: assignment; Type: TABLE DATA; Schema: public; Owner: forestnewark
--

COPY assignment (assignmentid, name, "time", points, column_5) FROM stdin;
\.


--
-- Name: assignment_assignmentid_seq; Type: SEQUENCE SET; Schema: public; Owner: forestnewark
--

SELECT pg_catalog.setval('assignment_assignmentid_seq', 1, false);


--
-- Data for Name: questions; Type: TABLE DATA; Schema: public; Owner: forestnewark
--

COPY questions (questionid, question, correctAnswer) FROM stdin;
\.


--
-- Name: questions_questionid_seq; Type: SEQUENCE SET; Schema: public; Owner: forestnewark
--

SELECT pg_catalog.setval('questions_questionid_seq', 1, false);


--
-- Name: assignment assignment_pkey; Type: CONSTRAINT; Schema: public; Owner: forestnewark
--

ALTER TABLE ONLY assignment
    ADD CONSTRAINT assignment_pkey PRIMARY KEY (assignmentid);


--
-- Name: questions questions_pkey; Type: CONSTRAINT; Schema: public; Owner: forestnewark
--

ALTER TABLE ONLY questions
    ADD CONSTRAINT questions_pkey PRIMARY KEY (questionid);


--
-- Name: assignment_assignmentid_uindex; Type: INDEX; Schema: public; Owner: forestnewark
--

CREATE UNIQUE INDEX assignment_assignmentid_uindex ON assignment USING btree (assignmentid);


--
-- Name: questions_questionid_uindex; Type: INDEX; Schema: public; Owner: forestnewark
--

CREATE UNIQUE INDEX questions_questionid_uindex ON questions USING btree (questionid);


--
-- PostgreSQL database dump complete
--

