package pos.bin;

import pos.common.EmptyShoppingCartException;
import pos.domains.Pos;
import pos.domains.ShoppingChart;
import pos.services.services.InputParser;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2015/1/2.
 */
public class PosCLI {
    public static void main (String args[]) throws IOException, EmptyShoppingCartException {
        InputParser inputParser = new InputParser(new File(args[0]), new File(args[1]));
        ShoppingChart shoppingChart = inputParser.parser();

        Pos pos = new Pos();
        String shoppingList = pos.getShoppingList(shoppingChart);
        System.out.print(shoppingList);
    }
}
