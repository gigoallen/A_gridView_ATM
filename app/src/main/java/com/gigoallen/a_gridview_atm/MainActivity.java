package com.gigoallen.a_gridview_atm;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class MainActivity extends AppCompatActivity {

    //String[] func = {"餘額查詢", "交易明細", "最新消息", "投資理財", "離開" };
    //or Resources
    //取得 array.xml 中的陣列financeGrid 資源
    Resources res = getResources();
    String[] func = res.getStringArray(R.array.financeGrid);

    //取得 res/drawable 中的圖片資源，放到 icons 陣列中, 注意！是 int 型別
    //圖檔重新命名：
    /*
    餘額查詢
    func_balance.png

            交易明細
    func_history.png

            最新消息
    func_news.png

            投資理財
    func_finance.png

            離開
    func_exit.png
    */

    int[] icons = {R.drawable.func_balance,
            R.drawable.func_history,
            R.drawable.func_news,
            R.drawable.func_finance,
            R.drawable.func_exit };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    class IconAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return func.length; //應回傳GridView中項目的個數，此處應回傳功能項目個數，可使用func陣列的數量值回傳
        }

        @Override
        public Object getItem(int i) {
            return func[i];  //應回傳參數 i 所對應的資源，可使用功能項目的字串，回傳給呼叫方
        }

        @Override
        public long getItemId(int i) {
            return icons[i]; //應回傳 i 所對應的id值，這個值應為可供辨識、不重複，在此使用圖示資源的id值
        }
        /*
        當GridView或其他清單元件在畫面中欲展示一個項目給使用者時，會呼叫此方法，
        傳入的第二個參數convertView即是目前呼叫方手上有的View元件。
        當然，在第一次呼叫時，傳入的convertView是null值，
        應該在convertView是null值時產生一個合適的View元件給呼叫方

         */
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }
}
