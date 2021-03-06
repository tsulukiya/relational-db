CREATE TABLE SUPPLIERS (
SUPPLIER_ID NUMBER,
CONSTRAINT SUPPLIERS_PK PRIMARY KEY (SUPPLIER_ID),
COMPANY_NAME NVARCHAR2(100),
CONTACT_NAME NVARCHAR2(100),
CONTACT_TITLE NVARCHAR2(100),
ADDRESS NVARCHAR2(250),
CITY NVARCHAR2(100),
REGION NVARCHAR2(100),
POSTAL_CODE NVARCHAR2(100),
COUNTRY NVARCHAR2(100),
PHONE NVARCHAR2(100),
FAX NVARCHAR2(100),
HOME_PAGE NVARCHAR2(100)
);