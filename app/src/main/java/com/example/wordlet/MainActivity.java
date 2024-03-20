package com.example.wordlet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cambioArgomento = findViewById(R.id.cambioArgomento);
        cambioArgomento.setOnClickListener(view -> {

        });

        TextView argomento = findViewById(R.id.argomento);
        argomento.setText("blabla");

        Button a = findViewById(R.id.a);
        a.setOnClickListener(view -> a.setEnabled(false));

        Button b = findViewById(R.id.b);
        b.setOnClickListener(view -> b.setEnabled(false));

        Button c = findViewById(R.id.c);
        c.setOnClickListener(view -> c.setEnabled(false));

        Button d = findViewById(R.id.d);
        d.setOnClickListener(view -> d.setEnabled(false));

        Button e = findViewById(R.id.e);
        e.setOnClickListener(view -> e.setEnabled(false));

        Button f = findViewById(R.id.f);
        f.setOnClickListener(view -> f.setEnabled(false));

        Button g = findViewById(R.id.g);
        g.setOnClickListener(view -> g.setEnabled(false));

        Button h = findViewById(R.id.h);
        h.setOnClickListener(view -> h.setEnabled(false));

        Button i = findViewById(R.id.i);
        i.setOnClickListener(view -> i.setEnabled(false));

        Button j = findViewById(R.id.j);
        j.setOnClickListener(view -> j.setEnabled(false));

        Button k = findViewById(R.id.k);
        k.setOnClickListener(view -> k.setEnabled(false));

        Button l = findViewById(R.id.l);
        l.setOnClickListener(view -> l.setEnabled(false));

        Button m = findViewById(R.id.m);
        m.setOnClickListener(view -> m.setEnabled(false));

        Button n = findViewById(R.id.n);
        n.setOnClickListener(view -> n.setEnabled(false));

        Button o = findViewById(R.id.o);
        o.setOnClickListener(view -> o.setEnabled(false));

        Button p = findViewById(R.id.p);
        p.setOnClickListener(view -> p.setEnabled(false));

        Button q = findViewById(R.id.q);
        q.setOnClickListener(view -> q.setEnabled(false));

        Button r = findViewById(R.id.r);
        r.setOnClickListener(view -> r.setEnabled(false));

        Button s = findViewById(R.id.s);
        s.setOnClickListener(view -> s.setEnabled(false));

        Button t = findViewById(R.id.t);
        t.setOnClickListener(view -> t.setEnabled(false));

        Button u = findViewById(R.id.u);
        u.setOnClickListener(view -> u.setEnabled(false));

        Button v = findViewById(R.id.v);
        v.setOnClickListener(view -> v.setEnabled(false));

        Button w = findViewById(R.id.w);
        w.setOnClickListener(view -> w.setEnabled(false));

        Button x = findViewById(R.id.x);
        x.setOnClickListener(view -> x.setEnabled(false));

        Button y = findViewById(R.id.y);
        y.setOnClickListener(view -> y.setEnabled(false));

        Button z = findViewById(R.id.z);
        z.setOnClickListener(view -> z.setEnabled(false));

        TextView tempo = findViewById(R.id.tempo);




    }
}