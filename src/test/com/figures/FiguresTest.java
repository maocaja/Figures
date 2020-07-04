package test.com.figures;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import main.com.figures.Figure;
import org.junit.Test;

public class FiguresTest {

    @Test
    public void whenCreateSquareStandard_thenDrawSquareStandard(){
        StringBuilder square = new StringBuilder().append("***").append(Figure.LINE_BREAK)
                                                  .append("***").append(Figure.LINE_BREAK)
                                                  .append("***").append(Figure.LINE_BREAK);
        assertThat(square.toString(), is(Figure.square(3)));
    }

    @Test
    public void whenCreateSquareSize5_thenDrawSquareSize5(){
        StringBuilder square = new StringBuilder()
                .append("*****").append(Figure.LINE_BREAK)
                .append("*****").append(Figure.LINE_BREAK)
                .append("*****").append(Figure.LINE_BREAK)
                .append("*****").append(Figure.LINE_BREAK)
                .append("*****").append(Figure.LINE_BREAK);
        assertThat(square.toString(), is(Figure.square(5)));
    }

    @Test
    public void whenCreatePyramidStandard_thenDrawPyramidStandard(){
        StringBuilder pyramid = new StringBuilder()
                .append("  *").append(Figure.LINE_BREAK)
                .append(" **").append(Figure.LINE_BREAK)
                .append("***").append(Figure.LINE_BREAK);
        assertThat(pyramid.toString(), is(Figure.pyramid(3)));
    }

    @Test
    public void whenCreatePyramidSize5_thenDrawPyramidSize5(){
        StringBuilder pyramid = new StringBuilder()
                .append("    *").append(Figure.LINE_BREAK)
                .append("   **").append(Figure.LINE_BREAK)
                .append("  ***").append(Figure.LINE_BREAK)
                .append(" ****").append(Figure.LINE_BREAK)
                .append("*****").append(Figure.LINE_BREAK);
        assertThat(pyramid.toString(), is(Figure.pyramid(5)));
    }

    @Test
    public void whenCreatePyramidSize10_thenDrawPyramidSize5(){
        StringBuilder pyramid = new StringBuilder()
                .append("         *").append(Figure.LINE_BREAK)
                .append("        **").append(Figure.LINE_BREAK)
                .append("       ***").append(Figure.LINE_BREAK)
                .append("      ****").append(Figure.LINE_BREAK)
                .append("     *****").append(Figure.LINE_BREAK)
                .append("    ******").append(Figure.LINE_BREAK)
                .append("   *******").append(Figure.LINE_BREAK)
                .append("  ********").append(Figure.LINE_BREAK)
                .append(" *********").append(Figure.LINE_BREAK)
                .append("**********").append(Figure.LINE_BREAK);
        assertThat(pyramid.toString(), is(Figure.pyramid(10)));
    }

    @Test
    public void whenCreateDiamondStandard_thenDrawDiamondStandard(){
        StringBuilder diamond = new StringBuilder()
                .append("  *").append(Figure.LINE_BREAK)
                .append(" **").append(Figure.LINE_BREAK)
                .append("***").append(Figure.LINE_BREAK)
                .append(" **").append(Figure.LINE_BREAK)
                .append("  *").append(Figure.LINE_BREAK);
        assertThat( diamond.toString(), is(Figure.diamond(3)));
    }

    @Test
    public void whenCreateDiamondSize8_thenDrawDiamondSize8(){
        StringBuilder diamond = new StringBuilder()
                .append("       *").append(Figure.LINE_BREAK)
                .append("      **").append(Figure.LINE_BREAK)
                .append("     ***").append(Figure.LINE_BREAK)
                .append("    ****").append(Figure.LINE_BREAK)
                .append("   *****").append(Figure.LINE_BREAK)
                .append("  ******").append(Figure.LINE_BREAK)
                .append(" *******").append(Figure.LINE_BREAK)
                .append("********").append(Figure.LINE_BREAK)
                .append(" *******").append(Figure.LINE_BREAK)
                .append("  ******").append(Figure.LINE_BREAK)
                .append("   *****").append(Figure.LINE_BREAK)
                .append("    ****").append(Figure.LINE_BREAK)
                .append("     ***").append(Figure.LINE_BREAK)
                .append("      **").append(Figure.LINE_BREAK)
                .append("       *").append(Figure.LINE_BREAK);
        assertThat(diamond.toString(), is(Figure.diamond(8)));
    }

    @Test
    public void whenCreateDiamondSize10_thenDrawDiamondSize10(){
        StringBuilder diamond = new StringBuilder()
                .append("         *").append(Figure.LINE_BREAK)
                .append("        **").append(Figure.LINE_BREAK)
                .append("       ***").append(Figure.LINE_BREAK)
                .append("      ****").append(Figure.LINE_BREAK)
                .append("     *****").append(Figure.LINE_BREAK)
                .append("    ******").append(Figure.LINE_BREAK)
                .append("   *******").append(Figure.LINE_BREAK)
                .append("  ********").append(Figure.LINE_BREAK)
                .append(" *********").append(Figure.LINE_BREAK)
                .append("**********").append(Figure.LINE_BREAK)
                .append(" *********").append(Figure.LINE_BREAK)
                .append("  ********").append(Figure.LINE_BREAK)
                .append("   *******").append(Figure.LINE_BREAK)
                .append("    ******").append(Figure.LINE_BREAK)
                .append("     *****").append(Figure.LINE_BREAK)
                .append("      ****").append(Figure.LINE_BREAK)
                .append("       ***").append(Figure.LINE_BREAK)
                .append("        **").append(Figure.LINE_BREAK)
                .append("         *").append(Figure.LINE_BREAK);

        assertThat(diamond.toString(), is(Figure.diamond(10)));
    }
}
