/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.a;
import com.growingio.d.a.f.ad;
import com.growingio.d.a.f.af;
import com.growingio.d.a.u;
import com.growingio.d.a.v;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.AttributesImpl;

public final class ae
extends a {
    ad a;
    private final String b;

    public ae(ad ad2, String string, int n2, String string2, String string3) {
        this(327680, ad2, string, n2, string3, string2, -1, -1, null, null, null, null);
    }

    public ae(ad ad2, String string, int n2, int n3, String string2) {
        this(327680, ad2, string, n2, string2, null, n3, -1, null, null, null, null);
    }

    public ae(ad ad2, String string, int n2, String string2, String string3, int n3, v v2) {
        this(327680, ad2, string, n2, string3, string2, -1, n3, v2, null, null, null);
    }

    public ae(ad ad2, String string, int n2, String string2, String string3, int n3, v v2, String[] arrstring, String[] arrstring2, int[] arrn) {
        this(327680, ad2, string, n2, string3, string2, -1, n3, v2, arrstring, arrstring2, arrn);
    }

    protected ae(int n2, ad ad2, String string, int n3, String string2, String string3, int n4) {
        this(n2, ad2, string, n3, string2, string3, n4, -1, null, null, null, null);
    }

    protected ae(int n2, ad ad2, String string, int n3, String string2, String string3, int n4, int n5, v v2, String[] arrstring, String[] arrstring2, int[] arrn) {
        int n6;
        StringBuilder stringBuilder;
        super(n2);
        this.a = ad2;
        this.b = string;
        AttributesImpl attributesImpl = new AttributesImpl();
        if (string3 != null) {
            attributesImpl.addAttribute("", "name", "name", "", string3);
        }
        if (n3 != 0) {
            attributesImpl.addAttribute("", "visible", "visible", "", n3 > 0 ? "true" : "false");
        }
        if (n4 != -1) {
            attributesImpl.addAttribute("", "parameter", "parameter", "", Integer.toString(n4));
        }
        if (string2 != null) {
            attributesImpl.addAttribute("", "desc", "desc", "", string2);
        }
        if (n5 != -1) {
            attributesImpl.addAttribute("", "typeRef", "typeRef", "", Integer.toString(n5));
        }
        if (v2 != null) {
            attributesImpl.addAttribute("", "typePath", "typePath", "", v2.toString());
        }
        if (arrstring != null) {
            stringBuilder = new StringBuilder(arrstring[0]);
            for (n6 = 1; n6 < arrstring.length; ++n6) {
                stringBuilder.append(" ").append(arrstring[n6]);
            }
            attributesImpl.addAttribute("", "start", "start", "", stringBuilder.toString());
        }
        if (arrstring2 != null) {
            stringBuilder = new StringBuilder(arrstring2[0]);
            for (n6 = 1; n6 < arrstring2.length; ++n6) {
                stringBuilder.append(" ").append(arrstring2[n6]);
            }
            attributesImpl.addAttribute("", "end", "end", "", stringBuilder.toString());
        }
        if (arrn != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(arrn[0]);
            for (n6 = 1; n6 < arrn.length; ++n6) {
                stringBuilder.append(" ").append(arrn[n6]);
            }
            attributesImpl.addAttribute("", "index", "index", "", stringBuilder.toString());
        }
        ad2.a(string, attributesImpl);
    }

    @Override
    public void a(String string, Object object) {
        Class class_ = object.getClass();
        if (class_.isArray()) {
            a a2 = this.a(string);
            if (object instanceof byte[]) {
                byte[] arrby = (byte[])object;
                for (int i2 = 0; i2 < arrby.length; ++i2) {
                    a2.a(null, Byte.valueOf(arrby[i2]));
                }
            } else if (object instanceof char[]) {
                char[] arrc = (char[])object;
                for (int i3 = 0; i3 < arrc.length; ++i3) {
                    a2.a(null, Character.valueOf(arrc[i3]));
                }
            } else if (object instanceof short[]) {
                short[] arrs = (short[])object;
                for (int i4 = 0; i4 < arrs.length; ++i4) {
                    a2.a(null, arrs[i4]);
                }
            } else if (object instanceof boolean[]) {
                boolean[] arrbl = (boolean[])object;
                for (int i5 = 0; i5 < arrbl.length; ++i5) {
                    a2.a(null, arrbl[i5]);
                }
            } else if (object instanceof int[]) {
                int[] arrn = (int[])object;
                for (int i6 = 0; i6 < arrn.length; ++i6) {
                    a2.a(null, arrn[i6]);
                }
            } else if (object instanceof long[]) {
                long[] arrl = (long[])object;
                for (int i7 = 0; i7 < arrl.length; ++i7) {
                    a2.a(null, arrl[i7]);
                }
            } else if (object instanceof float[]) {
                float[] arrf = (float[])object;
                for (int i8 = 0; i8 < arrf.length; ++i8) {
                    a2.a(null, Float.valueOf(arrf[i8]));
                }
            } else if (object instanceof double[]) {
                double[] arrd = (double[])object;
                for (int i9 = 0; i9 < arrd.length; ++i9) {
                    a2.a(null, arrd[i9]);
                }
            }
            a2.b_();
        } else {
            this.a("annotationValue", string, u.c(class_), object.toString());
        }
    }

    @Override
    public void a(String string, String string2, String string3) {
        this.a("annotationValueEnum", string, string2, string3);
    }

    @Override
    public a a(String string, String string2) {
        return new ae(this.a, "annotationValueAnnotation", 0, string, string2);
    }

    @Override
    public a a(String string) {
        return new ae(this.a, "annotationValueArray", 0, string, null);
    }

    @Override
    public void b_() {
        this.a.a(this.b);
    }

    private void a(String string, String string2, String string3, String string4) {
        AttributesImpl attributesImpl = new AttributesImpl();
        if (string2 != null) {
            attributesImpl.addAttribute("", "name", "name", "", string2);
        }
        if (string3 != null) {
            attributesImpl.addAttribute("", "desc", "desc", "", string3);
        }
        if (string4 != null) {
            attributesImpl.addAttribute("", "value", "value", "", af.a(string4));
        }
        this.a.b(string, attributesImpl);
    }
}

