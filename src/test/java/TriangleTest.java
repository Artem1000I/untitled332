import org.junit.jupiter.api.Assertions;
import org.testng.AssertJUnit;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TriangleTest {


    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Test
    public void equilateralTrianglesHaveEqualSides() throws TriangleException {
        Triangle triangle = new Triangle(2, 2, 2);

        AssertJUnit.assertEquals(TriangleKind.EQUILATERAL, triangle.getKind());
    }

    @Ignore("Remove to run test")
    @Test
    public void largerEquilateralTrianglesAlsoHaveEqualSides() throws TriangleException {
        Triangle triangle = new Triangle(10, 10, 10);

        AssertJUnit.assertEquals(TriangleKind.EQUILATERAL, triangle.getKind());
    }

    @Ignore("Remove to run test")
    @Test
    public void isoscelesTrianglesHaveLastTwoSidesEqual() throws TriangleException {
        Triangle triangle = new Triangle(3, 4, 4);

        AssertJUnit.assertEquals(TriangleKind.ISOSCELES, triangle.getKind());
    }

    @Ignore("Remove to run test")
    @Test
    public void isoscelesTrianglesHaveFirstAndLastSidesEqual() throws TriangleException {
        Triangle triangle = new Triangle(4, 3, 4);

        AssertJUnit.assertEquals(TriangleKind.ISOSCELES, triangle.getKind());
    }

    @Ignore("Remove to run test")
    @Test
    public void isoscelesTrianglesHaveTwoFirstSidesEqual() throws TriangleException {
        Triangle triangle = new Triangle(4, 4, 3);

        AssertJUnit.assertEquals(TriangleKind.ISOSCELES, triangle.getKind());
    }

    @Ignore("Remove to run test")
    @Test
    public void isoscelesTrianglesHaveInFactExactlyTwoSidesEqual() throws TriangleException {
        Triangle triangle = new Triangle(10, 10, 2);

        AssertJUnit.assertEquals(TriangleKind.ISOSCELES, triangle.getKind());
    }

    @Ignore("Remove to run test")
    @Test
    public void scaleneTrianglesHaveNoEqualSides() throws TriangleException {
        Triangle triangle = new Triangle(3, 4, 5);

        AssertJUnit.assertEquals(TriangleKind.SCALENE, triangle.getKind());
    }

    @Ignore("Remove to run test")
    @Test
    public void scaleneTrianglesHaveNoEqualSidesAtLargerScaleEither() throws TriangleException {
        Triangle triangle = new Triangle(10, 11, 12);

        AssertJUnit.assertEquals(TriangleKind.SCALENE, triangle.getKind());
    }

    @Ignore("Remove to run test")
    @Test
    public void scaleneTrianglesHaveNoEqualSidesInDescendingOrderEither() throws TriangleException {
        Triangle triangle = new Triangle(5, 4, 2);

        AssertJUnit.assertEquals(TriangleKind.SCALENE, triangle.getKind());
    }

    @Ignore("Remove to run test")
    @Test
    public void verySmallTrianglesAreLegal() throws TriangleException {
        Triangle triangle = new Triangle(0.4, 0.6, 0.3);

        AssertJUnit.assertEquals(TriangleKind.SCALENE, triangle.getKind());
    }

    @Ignore("Remove to run test")
    @Test
    public void trianglesWithNoSizeAreIllegal() throws TriangleException {
        thrown.expect(TriangleException.class);
        new Triangle(0, 0, 0);
    }

    @Ignore("Remove to run test")
    @Test
    public void trianglesWithNegativeSidesAreIllegal() throws TriangleException {
        thrown.expect(TriangleException.class);
        new Triangle(3, 4, -5);
    }

    @Ignore("Remove to run test")
    @Test
    public void trianglesViolatingTriangleInequalityAreIllegal() throws TriangleException {
        thrown.expect(TriangleException.class);
        new Triangle(1, 1, 3);
    }

    @Ignore("Remove to run test")
    @Test
    public void trianglesViolatingTriangleInequalityAreIllegal2() throws TriangleException {
        thrown.expect(TriangleException.class);
        new Triangle(2, 4, 2);
    }

    @Ignore("Remove to run test")
    @Test
    public void trianglesViolatingTriangleInequalityAreIllegal3() throws TriangleException {
        thrown.expect(TriangleException.class);
        new Triangle(7, 3, 2);
    }
}
