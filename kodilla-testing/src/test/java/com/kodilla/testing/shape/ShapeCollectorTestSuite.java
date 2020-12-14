package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("ShapeCollector tests")
    class ShapeCollectorTests {

        @Test
        void testAddFigure() {
            //Given
            ShapeColector shapeColector = new ShapeColector();
            //When
            shapeColector.addFigure(new Circle(5));
            //Then
            assertEquals(1, shapeColector.getNumberOfFigures());
        }

        @Test
        void TestRemoveFigureEmptyList() {
            //Given
            ShapeColector shapeColector= new ShapeColector();
            Circle circle = new Circle(5);
            //When
            boolean result = shapeColector.removeFigure(circle);
            //Then
            assertFalse(result);
        }

        @Test
        void testRemoveFigureNormalList() {
            //Given
            ShapeColector shapeColector= new ShapeColector();
            Circle circle = new Circle(5);
            shapeColector.addFigure(circle);
            //When
            boolean result = shapeColector.removeFigure(circle);
            //Then
            assertTrue(result);
            assertEquals(0, shapeColector.getNumberOfFigures());
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeColector shapeColector = new ShapeColector();
            Circle circle = new Circle(5);
            shapeColector.addFigure(circle);
            //When
            Shape shape = shapeColector.getFigure(0);
            //Then
            assertEquals(circle, shape);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeColector shapeColector = new ShapeColector();
            shapeColector.addFigure(new Circle(5));
            shapeColector.addFigure(new Square(5));
            shapeColector.addFigure(new Triangle(2,5));
            //When
            String figures = shapeColector.showFigures();
            //Then
            assertEquals("Circle, Square, Triangle", figures);
        }
    }

    @Nested
    @DisplayName("Figure tests")
    class FigureTests {

        @Nested
        @DisplayName("Circle Tests")
        class CircleTests {
            @Test
            void testGetCircleName() {
                //Given
                Circle circle = new Circle(5);
                //When
                String name = circle.getShapeName();
                //Then
                assertEquals("Circle", name);
            }

            @Test
            void testGetCircleField() {
                //Given
                Circle circle = new Circle(5);
                //When
                double field = circle.getField();
                //Then
                assertEquals(3.14*25, field);
            }
        }

        @Nested
        @DisplayName("Square Tests")
        class SquareTests {
            @Test
            void testGetSquareName() {
                //Given
                Square square = new Square(5);
                //When
                String name = square.getShapeName();
                //Then
                assertEquals("Square", name);
            }

            @Test
            void testGetSquareField() {
                //Given
                Square square = new Square(5);
                //When
                double field = square.getField();
                //Then
                assertEquals(25, field);
            }
        }

        @Nested
        @DisplayName("Triangle Tests")
        class TriangleTests {
            @Test
            void testGetTriangleName() {
                //Given
                Triangle triangle = new Triangle(2, 5);
                //When
                String name = triangle.getShapeName();
                //Then
                assertEquals("Triangle", name);
            }

            @Test
            void testTriangleField() {
                //Given
                Triangle triangle = new Triangle(2, 5);
                //When
                double field = triangle.getField();
                //Then
                assertEquals(5, field);
            }
        }
    }
}
