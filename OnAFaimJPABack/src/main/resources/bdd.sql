--
-- PostgreSQL database dump
--

-- Dumped from database version 10.11
-- Dumped by pg_dump version 10.11

-- Started on 2020-01-17 11:37:26

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2837 (class 0 OID 17248)
-- Dependencies: 202
-- Data for Name: compte; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.compte VALUES (1, 'W', 'thibautlesueur@hotmail.fr', 'mdp', 'lesueur', '0644702418', 'thibaut', 'client', 0);
INSERT INTO public.compte VALUES (2, 'W', 'thibautlesueur@hotmail.fr', 'mdp', 'lesueur', '0644702418', 'thibaut', 'client', 0);


--
-- TOC entry 2836 (class 0 OID 17243)
-- Dependencies: 201
-- Data for Name: commande; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.commande VALUES (100, 'W', 0, NULL, 0, 2);


--
-- TOC entry 2838 (class 0 OID 17256)
-- Dependencies: 203
-- Data for Name: devis; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.devis VALUES (100, NULL, 0, NULL, NULL, 0, 1);
INSERT INTO public.devis VALUES (101, 'W', 0, NULL, NULL, 0, 1);


--
-- TOC entry 2840 (class 0 OID 17266)
-- Dependencies: 205
-- Data for Name: produit; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.produit VALUES (1, NULL, 'choco', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (2, NULL, 'choco', NULL, 0, NULL, NULL);


--
-- TOC entry 2839 (class 0 OID 17261)
-- Dependencies: 204
-- Data for Name: ligne_commande; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.ligne_commande VALUES (3, 0, 100, 1);


--
-- TOC entry 2846 (class 0 OID 0)
-- Dependencies: 196
-- Name: seq_account; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.seq_account', 1, true);


--
-- TOC entry 2847 (class 0 OID 0)
-- Dependencies: 197
-- Name: seq_commande; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.seq_commande', 100, true);


--
-- TOC entry 2848 (class 0 OID 0)
-- Dependencies: 198
-- Name: seq_compte; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.seq_compte', 2, true);


--
-- TOC entry 2849 (class 0 OID 0)
-- Dependencies: 199
-- Name: seq_devis; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.seq_devis', 101, true);


--
-- TOC entry 2850 (class 0 OID 0)
-- Dependencies: 200
-- Name: seq_produit; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.seq_produit', 2, true);


-- Completed on 2020-01-17 11:37:26

--
-- PostgreSQL database dump complete
--

