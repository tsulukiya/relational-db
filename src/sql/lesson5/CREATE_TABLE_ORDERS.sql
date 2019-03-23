CREATE TABLE ORDERS (
ORDER_ID NUMBER,
CONSTRAINT ORDERS_PK PRIMARY KEY (ORDER_ID),
CUSTOMER_ID NUMBER,
CONSTRAINT CUSTOMERS_FK FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMERS (CUSTOMER_ID),
EMPLOYEE_ID NUMBER,
CONSTRAINT EMPLOYEES_FK FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEES (EMPLOYEE_ID),
SHIPPER_ID NUMBER,
CONSTRAINT SHIPPERS_FK FOREIGN KEY (SHIPPER_ID) REFERENCES SHIPPERS (SHIPPER_ID),
ORDER_DATE TIMESTAMP,
REQUIRED_DATE TIMESTAMP,
SHIPPED_DATE TIMESTAMP,
SHIP_VIA NVARCHAR2(50),
FREIGHT NVARCHAR2(50),
SHIP_NAME NVARCHAR2(100),
SHIP_ADDRESS NVARCHAR2(100),
SHIP_CITY NVARCHAR2(100),
SHIP_REGION NVARCHAR2(100),
SHIP_POSTAL_CODE NVARCHAR2(50),
SHIP_COUNTRY NVARCHAR2(50)
);