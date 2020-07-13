package com.example.javafilter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

import com.example.javafilter.adapter.ProductAdapter;
import com.example.javafilter.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainActivity extends AppCompatActivity {
    private EditText edtSearch;
    private Button btnSearch;
    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private List<Product>products;
    private List<Product>list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        edtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                System.out.println("KEY: "+s.toString());
                doFilter(s.toString());
            }
        });
    }
    private void doFilter(final String key){
        List<Product> listProductFiltered = new ArrayList<>();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            listProductFiltered.addAll(products
                    .stream()
                    .filter(x -> x.getName().contains(key) || x.getCode().contains(key))
                    .collect(Collectors.<Product>toList()));
        }
        list.clear();
        list.addAll(listProductFiltered);
        productAdapter.notifyDataSetChanged();
    }

    private void addControls() {
        list= new ArrayList<>();

        edtSearch=findViewById(R.id.edtSearch);
        btnSearch=findViewById(R.id.btnSearch);
        recyclerView=findViewById(R.id.recycleProduct);
        products= new ArrayList<>();
        productAdapter= new ProductAdapter(list);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(MainActivity.this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setAdapter(productAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

        loadData();
    }

    private void loadData() {
        List<Product> arr = new ArrayList<>();
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3801-1","000000035"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3801-2","000000036"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3801-3","000000037"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3801-4","000000038"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3802-1","000000039"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3802-2","000000040"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3802-3","000000041"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3802-4","000000042"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3803-1","000000043"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3803-2","000000044"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3803-3","000000045"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3803-4","000000046"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3804-1","000000047"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3804-2","000000048"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3804-3","000000049"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3804-4","000000050"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3804-5","000000051"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3804-6","000000052"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3805-1","000000053"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3805-2","000000054"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3805-3","000000055"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3805-4","000000056"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3806-1","000000057"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3806-2","000000058"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3806-3","000000059"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3806-4","000000060"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3806-5","000000061"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3807-1","000000062"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3807-2","000000063"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3807-3","000000064"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3807-4","000000065"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3808-1","000000066"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3808-2","000000067"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3808-3","000000068"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3808-4","000000069"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3809-1","000000070"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3809-2","000000071"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3809-3","000000072"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3809-4","000000073"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3809-5","000000074"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3811-1","000000075"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3811-2","000000076"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3811-3","000000077"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3811-4","000000078"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3811-5","000000079"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3811-6","000000080"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3811-7","000000081"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3811-8","000000082"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3812-1","000000083"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3812-2","000000084"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3812-3","000000085"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3812-4","000000086"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3812-5","000000087"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3813-1","000000088"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3813-2","000000089"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3813-3","000000090"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3813-4","000000091"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3813-5","000000092"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3813-6","000000093"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3813-7","000000094"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3813-8","000000095"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3813-9","000000096"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3813-10","000000097"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3813-11","000000098"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3813-12","000000099"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3814-1","000000100"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3814-2","000000101"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3814-3","000000102"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3814-4","000000103"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3814-5","000000104"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3814-6","000000105"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3814-7","000000106"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3814-8","000000107"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3814-9","000000108"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3815-1","000000109"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3815-2","000000110"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3815-3","000000111"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3815-4","000000112"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3816-1","000000113"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3816-2","000000114"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3816-3","000000115"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3816-4","000000116"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3817-1","000000117"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3817-2","000000118"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3817-3","000000119"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3817-4","000000120"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3818-1","000000121"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3818-2","000000122"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3818-3","000000123"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3818-4","000000124"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3819-1","000000125"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3819-2","000000126"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3820-1","000000127"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3820-2","000000128"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3820-3","000000129"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3820-4","000000130"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3821-1","000000131"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3821-2","000000132"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3821-3","000000133"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3821-4","000000134"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3822-1","000000135"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3822-2","000000136"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3822-3","000000137"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3823-1","000000138"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3823-2","000000139"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3823-3","000000140"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3824-1","000000141"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3824-2","000000142"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3824-3","000000143"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3824-4","000000144"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3824-5","000000145"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3825-1","000000146"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3825-2","000000147"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3829-1","000000148"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3829-2","000000149"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3829-3","000000150"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3830-1","000000151"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3830-2","000000152"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3830-3","000000153"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3831-1","000000154"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3831-2","000000155"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3831-3","000000156"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3831-4","000000157"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3833-1","000000158"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3833-2","000000159"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3813-13","000007838"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3813-14","000007839"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3810-1","000007852"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3810-4","000007853"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3810-2","000007854"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3810-3","000007855"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3810-5","000007856"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3810-6","000007857"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3827-1","000007858"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3827-2","000007859"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3828-1","000007860"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3828-2","000007861"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3832-1","000007863"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3832-2","000007864"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3826-1","000007875"));
        arr.add(new Product("BASE 2020 (1.06 m x 15.6 m) - 3826-2","000007876"));

        products.addAll(arr);
        list.addAll(arr);
        recyclerView.post(new Runnable() {
            @Override
            public void run() {
                productAdapter.notifyDataSetChanged();
            }
        });
    }
}