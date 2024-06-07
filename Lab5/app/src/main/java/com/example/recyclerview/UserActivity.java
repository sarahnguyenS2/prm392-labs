package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserActivity extends AppCompatActivity {
    ArrayList<User> userList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user);

        RecyclerView rvUser = findViewById(R.id.rvUser);

        userList.add(new User("NguyenTT", "Tran Thanh Nguyen", "nguyentt@fpt.edu.vn"));
        userList.add(new User("AnTV", "Tran Van An", "antv@fpt.edu.vn"));
        userList.add(new User("BangTT", "Tran Thanh Bang", "bangtt@fpt.edu.vn"));
        userList.add(new User("CongNT", "Nguyen Thanh Cong", "congnt@fpt.edu.vn"));
        userList.add(new User("HoangNV", "Nguyen Van Hoang", "hoangnv@fpt.edu.vn"));
        userList.add(new User("HuuNV", "Nguyen Van Huy", "huunv@fpt.edu.vn"));
        userList.add(new User("LongNT", "Nguyen Thanh Long", "longnt@fpt.edu.vn"));
        userList.add(new User("MinhNT", "Nguyen Thanh Minh", "minhnt@fpt.edu.vn"));
        userList.add(new User("NgocNT", "Nguyen Thanh Ngoc", "ngocnt@fpt.edu.vn"));
        userList.add(new User("QuangNT", "Nguyen Thanh Quang", "quangnt@fpt.edu.vn"));


        UserAdapter userAdapter = new UserAdapter(userList);
        rvUser.setAdapter(userAdapter);
        rvUser.setLayoutManager(new LinearLayoutManager(this));

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}