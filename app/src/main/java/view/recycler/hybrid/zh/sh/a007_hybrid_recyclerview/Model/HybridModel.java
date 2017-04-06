package view.recycler.hybrid.zh.sh.a007_hybrid_recyclerview.Model;

/**
 * Created by Suhayl SH on 4/1/2017.
 */

public class HybridModel {

    public static final int TYPE_ZERO = 0;
    public static final int TYPE_ONE = 1;
    public static final int TYPE_TWO = 2;

    public int card_type;
    public String mTitle;
    public String text_description;
    public int image_one;
    public int image_two;
    public int image_three;


    //Define different contructors based on what date you require to store for a prticular type of card
    //Here I am creating three different types. The data ll relect in a corresponding RecyclerView Item

    public HybridModel(int mType, String mTitle, String mDescription, int mImageOne)
    {
        this.card_type = mType;
        this.text_description = mDescription;
        this.mTitle = mTitle;
        this.image_one = mImageOne;
    }

    public HybridModel(int mType, String mTitle, String mDescription, int mImageOne, int mImageTwo)
    {
        this.card_type = mType;
        this.text_description = mDescription;
        this.mTitle = mTitle;
        this.image_one = mImageOne;
        this.image_two = mImageTwo;
    }

    public HybridModel(int mType, String mTitle, String mDescription, int mImageOne, int mImageTwo, int mImageThree)
    {
        this.card_type = mType;
        this.text_description = mDescription;
        this.mTitle = mTitle;
        this.image_one = mImageOne;
        this.image_two = mImageTwo;
        this.image_three = mImageThree;
    }
}
