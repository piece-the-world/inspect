/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.e;

import com.growingio.d.a.c.b;

public final class p
extends b {
    private final StringBuilder e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private StringBuilder k;
    private StringBuilder l;
    private int m;
    private int n;
    private String o = "";

    public p(int n2) {
        super(327680);
        this.f = (n2 & 512) != 0;
        this.e = new StringBuilder();
    }

    private p(StringBuilder stringBuilder) {
        super(327680);
        this.e = stringBuilder;
    }

    @Override
    public void c(String string) {
        this.e.append(this.g ? ", " : "<").append(string);
        this.g = true;
        this.h = false;
    }

    @Override
    public b b() {
        this.o = " extends ";
        this.o();
        return this;
    }

    @Override
    public b e() {
        this.o = this.h ? ", " : " extends ";
        this.h = true;
        this.o();
        return this;
    }

    @Override
    public b h() {
        this.n();
        this.o = " extends ";
        this.o();
        return this;
    }

    @Override
    public b d() {
        this.o = this.j ? ", " : (this.f ? " extends " : " implements ");
        this.j = true;
        this.o();
        return this;
    }

    @Override
    public b f() {
        this.n();
        if (this.i) {
            this.e.append(", ");
        } else {
            this.i = true;
            this.e.append('(');
        }
        this.o();
        return this;
    }

    @Override
    public b g() {
        this.n();
        if (this.i) {
            this.i = false;
        } else {
            this.e.append('(');
        }
        this.e.append(')');
        this.k = new StringBuilder();
        return new p(this.k);
    }

    @Override
    public b c() {
        if (this.l == null) {
            this.l = new StringBuilder();
        } else {
            this.l.append(", ");
        }
        return new p(this.l);
    }

    @Override
    public void a(char c2) {
        switch (c2) {
            case 'V': {
                this.e.append("void");
                break;
            }
            case 'B': {
                this.e.append("byte");
                break;
            }
            case 'J': {
                this.e.append("long");
                break;
            }
            case 'Z': {
                this.e.append("boolean");
                break;
            }
            case 'I': {
                this.e.append("int");
                break;
            }
            case 'S': {
                this.e.append("short");
                break;
            }
            case 'C': {
                this.e.append("char");
                break;
            }
            case 'F': {
                this.e.append("float");
                break;
            }
            default: {
                this.e.append("double");
            }
        }
        this.p();
    }

    @Override
    public void d(String string) {
        this.e.append(string);
        this.p();
    }

    @Override
    public b a() {
        this.o();
        this.n |= 1;
        return this;
    }

    @Override
    public void a(String string) {
        if ("java/lang/Object".equals(string)) {
            boolean bl2;
            boolean bl3 = bl2 = this.m % 2 != 0 || this.i;
            if (bl2) {
                this.e.append(this.o).append(string.replace('/', '.'));
            }
        } else {
            this.e.append(this.o).append(string.replace('/', '.'));
        }
        this.o = "";
        this.m *= 2;
    }

    @Override
    public void b(String string) {
        if (this.m % 2 != 0) {
            this.e.append('>');
        }
        this.m /= 2;
        this.e.append('.');
        this.e.append(this.o).append(string.replace('/', '.'));
        this.o = "";
        this.m *= 2;
    }

    @Override
    public void i() {
        if (this.m % 2 == 0) {
            ++this.m;
            this.e.append('<');
        } else {
            this.e.append(", ");
        }
        this.e.append('?');
    }

    @Override
    public b b(char c2) {
        if (this.m % 2 == 0) {
            ++this.m;
            this.e.append('<');
        } else {
            this.e.append(", ");
        }
        if (c2 == '+') {
            this.e.append("? extends ");
        } else if (c2 == '-') {
            this.e.append("? super ");
        }
        this.o();
        return this;
    }

    @Override
    public void j() {
        if (this.m % 2 != 0) {
            this.e.append('>');
        }
        this.m /= 2;
        this.p();
    }

    public String k() {
        return this.e.toString();
    }

    public String l() {
        return this.k == null ? null : this.k.toString();
    }

    public String m() {
        return this.l == null ? null : this.l.toString();
    }

    private void n() {
        if (this.g) {
            this.e.append('>');
            this.g = false;
        }
    }

    private void o() {
        this.n *= 2;
    }

    private void p() {
        if (this.n % 2 == 0) {
            this.n /= 2;
        } else {
            while (this.n % 2 != 0) {
                this.n /= 2;
                this.e.append("[]");
            }
        }
    }
}

