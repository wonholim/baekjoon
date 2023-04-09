-- 코드를 입력하세요
SELECT PRODUCT_CODE, SUM(PRICE * OFFLINE_SALE.SALES_AMOUNT) AS SALES
FROM PRODUCT
JOIN OFFLINE_SALE
ON PRODUCT.PRODUCT_ID = OFFLINE_SALE.PRODUCT_ID
GROUP BY PRODUCT_CODE
ORDER BY SALES DESC, PRODUCT_CODE
;