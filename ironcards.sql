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
-- Name: ironcards; Type: DATABASE; Schema: -; Owner: Cwolf
--

CREATE DATABASE ironcards WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'en_US.UTF-8' LC_CTYPE = 'en_US.UTF-8';


ALTER DATABASE ironcards OWNER TO "Cwolf";

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
-- Name: assignment; Type: TABLE; Schema: public; Owner: Cwolf
--

CREATE TABLE assignment (
    assignmentid integer NOT NULL,
    name character varying(100) NOT NULL,
    "time" integer NOT NULL,
    points integer NOT NULL
);


ALTER TABLE assignment OWNER TO "Cwolf";

--
-- Name: assignment_assignmentid_seq; Type: SEQUENCE; Schema: public; Owner: Cwolf
--

CREATE SEQUENCE assignment_assignmentid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE assignment_assignmentid_seq OWNER TO "Cwolf";

--
-- Name: assignment_assignmentid_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: Cwolf
--

ALTER SEQUENCE assignment_assignmentid_seq OWNED BY assignment.assignmentid;


--
-- Name: leaderboard; Type: TABLE; Schema: public; Owner: Cwolf
--

CREATE TABLE leaderboard (
    leaderboardid integer NOT NULL,
    username character varying(30) NOT NULL,
    score integer NOT NULL
);


ALTER TABLE leaderboard OWNER TO "Cwolf";

--
-- Name: leaderboard_leaderboardid_seq; Type: SEQUENCE; Schema: public; Owner: Cwolf
--

CREATE SEQUENCE leaderboard_leaderboardid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE leaderboard_leaderboardid_seq OWNER TO "Cwolf";

--
-- Name: leaderboard_leaderboardid_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: Cwolf
--

ALTER SEQUENCE leaderboard_leaderboardid_seq OWNED BY leaderboard.leaderboardid;


--
-- Name: questions; Type: TABLE; Schema: public; Owner: Cwolf
--

CREATE TABLE questions (
    questionid integer NOT NULL,
    question character varying(100) NOT NULL,
    correctanswer character varying(50) NOT NULL,
    aanswer character varying(50) NOT NULL,
    banswer character varying(50) NOT NULL,
    canswer character varying(50) NOT NULL,
    danswer character varying(50) NOT NULL
);


ALTER TABLE questions OWNER TO "Cwolf";

--
-- Name: questions_questionid_seq; Type: SEQUENCE; Schema: public; Owner: Cwolf
--

CREATE SEQUENCE questions_questionid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE questions_questionid_seq OWNER TO "Cwolf";

--
-- Name: questions_questionid_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: Cwolf
--

ALTER SEQUENCE questions_questionid_seq OWNED BY questions.questionid;


--
-- Name: assignment assignmentid; Type: DEFAULT; Schema: public; Owner: Cwolf
--

ALTER TABLE ONLY assignment ALTER COLUMN assignmentid SET DEFAULT nextval('assignment_assignmentid_seq'::regclass);


--
-- Name: leaderboard leaderboardid; Type: DEFAULT; Schema: public; Owner: Cwolf
--

ALTER TABLE ONLY leaderboard ALTER COLUMN leaderboardid SET DEFAULT nextval('leaderboard_leaderboardid_seq'::regclass);


--
-- Name: questions questionid; Type: DEFAULT; Schema: public; Owner: Cwolf
--

ALTER TABLE ONLY questions ALTER COLUMN questionid SET DEFAULT nextval('questions_questionid_seq'::regclass);


--
-- Data for Name: assignment; Type: TABLE DATA; Schema: public; Owner: Cwolf
--

COPY assignment (assignmentid, name, "time", points) FROM stdin;
\.


--
-- Name: assignment_assignmentid_seq; Type: SEQUENCE SET; Schema: public; Owner: Cwolf
--

SELECT pg_catalog.setval('assignment_assignmentid_seq', 1, false);


--
-- Data for Name: leaderboard; Type: TABLE DATA; Schema: public; Owner: Cwolf
--

COPY leaderboard (leaderboardid, username, score) FROM stdin;
\.


--
-- Name: leaderboard_leaderboardid_seq; Type: SEQUENCE SET; Schema: public; Owner: Cwolf
--

SELECT pg_catalog.setval('leaderboard_leaderboardid_seq', 1, false);


--
-- Data for Name: questions; Type: TABLE DATA; Schema: public; Owner: Cwolf
--

COPY questions (questionid, question, correctanswer, aanswer, banswer, canswer, danswer) FROM stdin;
1	What does HTML stand for?	Hypertext Markup Language	Hypertrophic Management Language	Hypertext Markup Language	Hyperberic Tertiary Logrithm	Hyperresonant Marginal Logrithm\n
2	An object could be ...	Anything	An algorithm	Anything	A data container	A program
3	The last value in an array called ar can be found at index:	Ar.length - 1	0	Ar.length - 1	Ar.length	1
4	Choose the appropriate data type for this value: "true"	Boolean	Int	String	Boolean	Double
5	What is the correct syntax for java main method?	public static void main(string[] args)	Public void main(String[] args)	Public static void main()	public static void main(string[] args)	None of the above
6	What's the correct HTML tag for the largest heading?	H1	Heading	H1	H6	Head
7	What does CSS stand for?	Cascading Style Sheets	Create Style Sheets	Computer Style Sheets	Cascading Style Sheets	None of the above
8	How do you insert a comment in a CSS file? 	// this is a comment	/* this is a comment */	\n// this is a comment //	// this is a comment	' this is a comment
\.


--
-- Name: questions_questionid_seq; Type: SEQUENCE SET; Schema: public; Owner: Cwolf
--

SELECT pg_catalog.setval('questions_questionid_seq', 8, true);


--
-- Name: assignment assignment_pkey; Type: CONSTRAINT; Schema: public; Owner: Cwolf
--

ALTER TABLE ONLY assignment
    ADD CONSTRAINT assignment_pkey PRIMARY KEY (assignmentid);


--
-- Name: leaderboard leaderboard_pkey; Type: CONSTRAINT; Schema: public; Owner: Cwolf
--

ALTER TABLE ONLY leaderboard
    ADD CONSTRAINT leaderboard_pkey PRIMARY KEY (leaderboardid);


--
-- Name: questions questions_pkey; Type: CONSTRAINT; Schema: public; Owner: Cwolf
--

ALTER TABLE ONLY questions
    ADD CONSTRAINT questions_pkey PRIMARY KEY (questionid);


--
-- Name: assignment_assignmentid_uindex; Type: INDEX; Schema: public; Owner: Cwolf
--

CREATE UNIQUE INDEX assignment_assignmentid_uindex ON assignment USING btree (assignmentid);


--
-- Name: leaderboard_leaderboardid_uindex; Type: INDEX; Schema: public; Owner: Cwolf
--

CREATE UNIQUE INDEX leaderboard_leaderboardid_uindex ON leaderboard USING btree (leaderboardid);


--
-- Name: questions_questionid_uindex; Type: INDEX; Schema: public; Owner: Cwolf
--

CREATE UNIQUE INDEX questions_questionid_uindex ON questions USING btree (questionid);


--
-- PostgreSQL database dump complete
--

