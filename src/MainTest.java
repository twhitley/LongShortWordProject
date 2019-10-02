import org.junit.Assert;

import java.util.HashMap;

public class MainTest {

    HashMap<String, Integer> expected = new HashMap<String,Integer>();
    Main myMain = new Main();

    @org.junit.Test
    public void getLongestWord() {

        expected.put("", 0);
        Assert.assertEquals(expected, myMain.getLongestWord(""));
        expected.clear();

        expected.put("jumped", 6);
        Assert.assertEquals(expected, myMain.getLongestWord("The cow jumped over the moon"));
        expected.clear();

        expected.put("jumped", 6);
        Assert.assertEquals(expected, myMain.getLongestWord("The cow jumped over the moon!!"));
        expected.clear();

        expected.put("jumped", 6);
        Assert.assertEquals(expected, myMain.getLongestWord("!!The cow jumped over the moon"));
        expected.clear();

        expected.put("jumped", 6);
        Assert.assertEquals(expected, myMain.getLongestWord("The cow jumped heyyou over the moon"));
        expected.clear();

        expected.put("jumped", 6);
        Assert.assertEquals(expected, myMain.getLongestWord("The cow jumped jumped over the moon"));
        expected.clear();

        expected.put("jumpedjumped", 12);
        Assert.assertEquals(expected, myMain.getLongestWord("The cow jumpedjumped over the moon"));
        expected.clear();

        expected.put("the", 3);
        Assert.assertEquals(expected, myMain.getLongestWord("The cow"));
        expected.clear();

        expected.put("jumped", 6);
        Assert.assertEquals(expected, myMain.getLongestWord("  The cow jumped over the moon "));
        expected.clear();

        expected.put("thecowjumpedoverthemoon", 23);
        Assert.assertEquals(expected, myMain.getLongestWord("Thecowjumpedoverthemoon"));
        expected.clear();

        expected.put("jumped", 6);
        Assert.assertEquals(expected, myMain.getLongestWord("The cow jumped over the 6 moons"));
        expected.clear();

        expected.put("jumped", 6);
        Assert.assertEquals(expected, myMain.getLongestWord("The   cow   jumped   over   the   moon"));
        expected.clear();

        expected.put("jumped", 6);
        Assert.assertEquals(expected, myMain.getLongestWord("The&& cow   jumped   over   the   moon"));
        expected.clear();

    }

    @org.junit.Test
    public void getShortestWord() {

        expected.put("", 0);
        Assert.assertEquals(expected, myMain.getShortestWord(""));
        expected.clear();

        expected.put("the", 3);
        Assert.assertEquals(expected, myMain.getShortestWord("The cow jumped over the moon"));
        expected.clear();

        expected.put("the", 3);
        Assert.assertEquals(expected, myMain.getShortestWord("The cow jumped over the moon!!"));
        expected.clear();

        expected.put("the", 3);
        Assert.assertEquals(expected, myMain.getShortestWord("!!The cow jumped over the moon"));
        expected.clear();

        expected.put("a", 1);
        Assert.assertEquals(expected, myMain.getShortestWord("a The cow jumped over the moon"));
        expected.clear();

        expected.put("n", 1);
        Assert.assertEquals(expected, myMain.getShortestWord("The cow jumped over the moo n"));
        expected.clear();

        expected.put("the", 3);
        Assert.assertEquals(expected, myMain.getShortestWord("The cow"));
        expected.clear();

        expected.put("a", 1);
        Assert.assertEquals(expected, myMain.getShortestWord(" The cow jumped over a moon "));
        expected.clear();

        expected.put("thecowjumpedoverthemoon", 23);
        Assert.assertEquals(expected, myMain.getShortestWord("Thecowjumpedoverthemoon"));
        expected.clear();

        expected.put("the", 3);
        Assert.assertEquals(expected, myMain.getShortestWord("The cow jumped over the 6 moons"));
        expected.clear();

        expected.put("the", 3);
        Assert.assertEquals(expected, myMain.getShortestWord("The   cow   jumped   over   the   moon"));
        expected.clear();

        expected.put("the", 3);
        Assert.assertEquals(expected, myMain.getShortestWord("The&&&   cow   jumped   over   the   moon"));
        expected.clear();
    }
}