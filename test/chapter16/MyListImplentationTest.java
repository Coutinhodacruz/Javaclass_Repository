package chapter16;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyListImplentationTest {



        private MyListImplementation list = new MyListImplementation();

        @Before
        public void setUp() {
            list = new MyListImplementation();
        }

        @Test
        public void testAdd() {
            list.add("Element 1");
            list.add("Element 2");
            list.add("Element 3");

            Assert.assertEquals(3, list.getListSize());
            Assert.assertEquals(10, list.getCapacity());
        }

        @Test
        public void testDelete() {
            list.add("Element 1");
            list.add("Element 2");
            list.add("Element 3");

            list.delete("Element 2");

            Assert.assertEquals(2, list.getListSize());
            Assert.assertEquals(10, list.getCapacity());
            Assert.assertEquals(-1, list.indexOf("Element 2"));
        }


    @Test
    public void testGetCapacity() {
        Assert.assertEquals(10, list.getCapacity());
    }

    @Test
    public void testGetListSize() {
        Assert.assertEquals(0, list.getListSize());
    }

}



//
//import org.junit.jupiter.api.Assertions;
//        import org.junit.jupiter.api.BeforeEach;
//        import org.junit.jupiter.api.Test;
//
//public class MyArrayListTest {
//    private MyArrayList myArrayList;
//
//    @BeforeEach
//    public void setUp() {
//        myArrayList = new MyArrayList();
//    }
//
//    @Test
//    public void testAdd() {
//        Object element = "Test";
//        myArrayList.add(element);
//
//        Assertions.assertEquals(1, myArrayList.getListSize());
//        Assertions.assertEquals(10, myArrayList.getCapacity());
//    }
//
//    @Test
//    public void testDelete() {
//        Object element = "Test";
//        myArrayList.add(element);
//
//        myArrayList.delete(element);
//
//        Assertions.assertEquals(0, myArrayList.getListSize());
//        Assertions.assertEquals(10, myArrayList.getCapacity());
//    }
//
//    @Test
//    public void testEnsureCapacity() {
//        myArrayList.ensureCapacity(20);
//
//        Assertions.assertEquals(10, myArrayList.getCapacity());
//
//        myArrayList.ensureCapacity(15);
//
//        Assertions.assertEquals(15, myArrayList.getCapacity());
//    }
//
//    @Test
//    public void testIndexOf() {
//        Object element = "Test";
//        myArrayList.add(element);
//
//        int index = myArrayList.indexOf(element);
//
//        Assertions.assertEquals(0, index);
//
//        int nonExistentIndex = myArrayList.indexOf("NonExistent");
//
//        Assertions.assertEquals(-1, nonExistentIndex);
//    }
//}
