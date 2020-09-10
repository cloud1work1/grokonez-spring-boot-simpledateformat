# grokonez-spring-boot-simpledateformat
- ## SimpleDateFomat with ISO
  ```
   @RequestParam("date") @DateTimeFormat(iso=DateTimeFormat.DATE) Date date,
   @RequestParam("localdate") @DateTimeFormat(iso=DateTimeFormat.DATE) LocalDate localDate,
   @RequestParam(localdatetime") @DateTimeFormat(iso=DateTimeFormat.DateTime) LocalDateTime localDateTime
    ```
    
 - ## SimpleDateFomat with pattern
  ```
   @RequestParam("date") @DateTimeFormat(pattern="yyyy.MM.dd") Date date,
   @RequestParam("localdate") @DateTimeFormat(pattern="yyyy.MM.dd") LocalDate localDate,
   @RequestParam(localdatetime") @DateTimeFormat(pattern="yyyy.MM.dd HH:mm:ss") LocalDateTime localDateTime
    ```
