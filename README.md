# JUnitTestingProject

<br>

**Hello there**, <br>

This is a java project to learn JUnit testing. Feel free to click on discussions for any comments, feedback, questions etc.

<br>

### 1. ASSERTIONS

| # | **Assertion** |
|-|-|
| 1.  | assertNull() |
| 2.  | assertNotNull() |
| 3.  | assertEquals() |
| 4.  | assertNotEquals() |
| 5.  | fail() method |
| 6.  | assertTrue() |
| 7.  | assertFalse() |
| 8.  | assertSame() |
| 9.  | assertNotSame() |
| 10. | assertArrayEquals() |
| 11. | assertIterableEquals() |
| 12. | assertThrows() |
| 13. | assertTimeout() |
| 14. | assertTimeoutPreemtively() |
|||

<br>

### 2. LIFECYCLE CALLBACKS

| # | **JUnit 4 Callback** | **JUnit 5 Callback** |
|-|-|-|
| 1. | @Before      | @BeforeEach |
| 2. | @BeforeClass | @BeforeAll |
| 3. | @After       | @AfterEach |
| 4. | @BeforeClass | @BeforeAll |
| 5. | @AfterClass  | @AfterAll |
| 6. | @RunWith     | @ExtendWith |
| 7. | @Test        | @Test |
| 8. | @Ignore      | @Disabled |
| 9. | @Category    | @Tag |
||||

<br>

### 3. DISPLAY NAMES

| # | **Annotation** | **Scope** |
|-|-|-|
| 1. | @DisplayName | Test Class |
| 2. | @DisplayName | Test Methods |
|||

<br>

### 4. DEPENDENCY INJECTION:
***For Constructors and Methods*** <br>
   
   | # | **Class** |
   |-|-|
   | 1. | TestInfoParameterResolver |
   | 2. | TestReporterParameterResovler |
   | 3. | RepetitionInfoParameterResolver|
   |||

<br>

### 5. ASSUMPTIONS

| # | **Assumption** |
|-|-|
| 1. | assumeTrue() |
| 2. | assumeFalse() |
| 3. | assumingThat() |
|||

<br>

### 6. OTHER ASSUMPTION LIBRARIES

| # | **Library** |
|-|-|
| 1. | AssertJ |
| 2. | Hamcrest |
| 3. | JSONAsser |

<br>

### 7. JUNIT 5 EXTENSIONS 

| # | Extension |
|-|-|
| 1. | TestInstancePostProcessor |
| 2. | ExecutionCondition |
| 3. | Life Cycle Callback Extensions | BeforeAllCallback, BeforeEachCallback, BeforeTestExecutionCallback, AfterTestExecutionCallback, AftereachCallback, AfterAllCallback |
| 4. | ParameterResolver |
| 5. | TestExecutionExceptionHandler |
|||

<br>

### 8. JUnit 5 EXTENSIONS REGISTRATION

| # | **Registration** | Method |
|-|-|-|
| 1. | Declarative registration | @ExtendWith |
| 2. | Programmatic registration | @RegisterExtension |
| 3. | Automatic Registration | ***java.util.ServiceLoader*** |
|||

<br>

### 9. OTHER ANNOTATIONS

| # | **Annottation** | Purpose |
|-|-|-|
| 1.  | @Enabled | Enable test method |
| 2.  | @Disabled | Disbale test method |
| 3.  | @EnabledIf | Enable with condition |
| 4.  | @DisabledIf | Disable with condition |
| 4.  | @EnabledIfEnvironmentVariable | Enable for environment |
| 5.  | @DisabledIfEnvironmentVariable | Disable for Enviroment |
| 6.  | @EnabledIfSystemProperty | Enable for system property |
| 7.  | @DisabledIfSystemProperty | Disable for system property |
| 8.  | @EnabledOnJre | Enable for JRE version |
| 9.  | @DisabledOnJre | Disable for JRE version |
| 10.  | @EnabledForJreRange | Enable for JRE range |
| 11. | @DisabledForJreRange | Disable for JRE range |
| 12. | @Nested | Nested test classes |
| 13. | @ParameterizedTest - @ValueSource | Provide values array |
| 14. | @ParameterizedTest - @EnumSource | Provide enum source |
| 15. | @ParameterizedTest - @MethodSource | Provide values from method |
| 16. | @ParameterizedTest - @CsvSource | Provide values from CSV |
| 17. | @ParameterizedTest - @CsvFileSource | Provide values from CSV file |
| 18. | @RepeatedTest | Repeated test with count @RepeatedTest(n) |
| 19. | @TestFactory | For dynamic tests |
| 20. | @Tag | For tagged test - Tests Classification |
|||

<br>
