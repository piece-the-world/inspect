/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aC;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.g.A;
import com.growingio.a.a.g.B;
import com.growingio.a.a.g.C;
import com.growingio.a.a.g.D;
import com.growingio.a.a.g.J;
import com.growingio.a.a.g.K;
import com.growingio.a.a.g.L;
import com.growingio.a.a.g.M;
import com.growingio.a.a.g.r;
import com.growingio.a.a.g.s;
import com.growingio.a.a.g.y;
import com.growingio.a.a.g.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class x {
    private static final String a = "%s, nodes: %s, edges: %s";
    private static final String b = "<%s -> %s>";
    private static final String c = "[%s, %s]";

    private x() {
    }

    public static <N> N a(L<N, ?> l2, Object object, Object object2) {
        N n2;
        if (l2 instanceof D) {
            throw new UnsupportedOperationException();
        }
        aU.a(object2, (Object)"node");
        Iterator<N> iterator = l2.e(object).iterator();
        N n3 = iterator.next();
        N n4 = n2 = iterator.hasNext() ? iterator.next() : n3;
        if (object2.equals(n3)) {
            return n2;
        }
        aU.a(object2.equals(n2), "Edge %s is not incident to node %s", object, object2);
        return n3;
    }

    public static <N, E> Set<E> a(L<N, E> l2, Object object) {
        if (l2 instanceof D) {
            throw new UnsupportedOperationException();
        }
        Set<N> set = l2.e(object);
        if (!l2.e()) {
            return fg.k();
        }
        Iterator<N> iterator = set.iterator();
        N n2 = iterator.next();
        N n3 = iterator.hasNext() ? iterator.next() : n2;
        return lI.c(l2.a(n2, n3), fg.d(object));
    }

    public static <N, E> boolean a(K<N, E> k2, E e2, Iterable<N> iterable) {
        aU.a(k2, (Object)"graph");
        aU.a(e2, (Object)"edge");
        aU.a(iterable, (Object)"nodes");
        if (k2 instanceof D) {
            return ((D)((Object)k2)).a(e2, iterable);
        }
        Iterator<N> iterator = iterable.iterator();
        aU.a(iterator.hasNext(), "'graph' is not a Hypergraph, and 'nodes' has < 1 elements: %s", iterable);
        N n2 = iterator.next();
        N n3 = iterator.hasNext() ? iterator.next() : n2;
        aU.a(!iterator.hasNext(), "'graph' is not a Hypergraph, and 'nodes' has > 2 elements: %s", iterable);
        return k2.a(e2, n2, n3);
    }

    public static <N> J<N> a(r<N> r2) {
        return x.a(r2, aW.a());
    }

    public static <N> J<N> a(r<N> r2, aV<? super N> aV2) {
        aU.a(r2, (Object)"graph");
        aU.a(aV2, (Object)"nodePredicate");
        J j2 = s.a(r2).a(r2.a().size()).c();
        for (N n2 : r2.a()) {
            if (!aV2.a(n2)) continue;
            j2.i(n2);
            for (N n3 : r2.c(n2)) {
                if (!aV2.a(n3)) continue;
                j2.a(n2, n3);
            }
        }
        return j2;
    }

    public static <N> void a(r<N> r2, J<N> j2) {
        x.a(r2, j2, aW.a());
    }

    public static <N, E> void a(r<N> r2, J<N> j2, aV<? super N> aV2) {
        aU.a(r2, (Object)"original");
        aU.a(j2, (Object)"copy");
        aU.a(aV2, (Object)"nodePredicate");
        for (N n2 : lI.a(r2.a(), aV2)) {
            j2.i(n2);
        }
    }

    public static <N, E> K<N, E> a(L<N, E> l2) {
        return x.a(l2, aW.a(), aW.a());
    }

    public static <N, E> K<N, E> a(L<N, E> l2, aV<? super N> aV2, aV<? super E> aV3) {
        aU.a(l2, (Object)"graph");
        aU.a(aV2, (Object)"nodePredicate");
        aU.a(aV3, (Object)"edgePredicate");
        K k2 = M.a(l2).a(l2.a().size()).b(l2.d().size()).c();
        x.a(l2, k2, aV2);
        for (E e2 : l2.d()) {
            if (!aV3.a(e2)) continue;
            Set<N> set = l2.e(e2);
            if (!k2.a().containsAll(set)) continue;
            x.a(k2, e2, set);
        }
        return k2;
    }

    public static <N> void a(r<N> r2, K<N, ?> k2) {
        x.a(r2, k2, aW.a());
    }

    public static <N, E> void a(r<N> r2, K<N, ?> k2, aV<? super N> aV2) {
        aU.a(r2, (Object)"original");
        aU.a(k2, (Object)"copy");
        aU.a(aV2, (Object)"nodePredicate");
        for (N n2 : lI.a(r2.a(), aV2)) {
            k2.o(n2);
        }
    }

    public static <N, E> void a(L<N, E> l2, K<N, E> k2) {
        x.a(l2, k2, aW.a());
    }

    public static <N, E> void a(L<N, E> l2, K<N, E> k2, aV<? super E> aV2) {
        aU.a(l2, (Object)"original");
        aU.a(k2, (Object)"copy");
        aU.a(aV2, (Object)"edgePredicate");
        for (E e2 : lI.a(l2.d(), aV2)) {
            x.a(k2, e2, l2.e(e2));
        }
    }

    public static boolean a(r<?> r2, r<?> r3) {
        if (r2 instanceof L && r3 instanceof L) {
            return x.a((L)r2, (L)r3);
        }
        if (r2 instanceof L || r3 instanceof L) {
            return false;
        }
        if (r2 == r3) {
            return true;
        }
        if (r2 == null || r3 == null) {
            return false;
        }
        if (!r2.a().equals(r3.a())) {
            return false;
        }
        for (Object obj : r2.a()) {
            if (!r2.c(obj).equals(r3.c(obj))) {
                return false;
            }
            boolean bl2 = !r2.b() && !r3.b();
            if (bl2 || r2.b(obj).equals(r3.b(obj))) continue;
            return false;
        }
        return true;
    }

    public static boolean a(L<?, ?> l2, L<?, ?> l3) {
        if (l2 == l3) {
            return true;
        }
        if (l2 == null || l3 == null) {
            return false;
        }
        if (l2.d().size() != l3.d().size()) {
            return false;
        }
        if (!l2.a().equals(l3.a())) {
            return false;
        }
        for (Object n2 : l2.a()) {
            if (!l2.a_(n2).equals(l3.a_(n2))) {
                return false;
            }
            boolean bl2 = !l2.b() && !l3.b();
            if (bl2 || l2.b_(n2).equals(l3.b_(n2))) continue;
            return false;
        }
        return true;
    }

    public static int b(r<?> r2) {
        return r2 instanceof L ? x.b((L)r2) : x.e(r2).hashCode();
    }

    public static int b(L<?, ?> l2) {
        return x.e(l2).hashCode();
    }

    public static String c(r<?> r2) {
        if (r2 instanceof L) {
            return x.c((L)r2);
        }
        return String.format("%s, nodes: %s, edges: %s", x.f(r2), r2.a(), x.d(r2));
    }

    public static String c(L<?, ?> l2) {
        return String.format("%s, nodes: %s, edges: %s", x.g(l2), l2.a(), ii.a(l2.d(), x.f(l2)));
    }

    public static <E> aV<E> d(L<?, E> l2) {
        aU.a(l2, (Object)"graph");
        return new y(l2);
    }

    private static <N> String d(r<N> r2) {
        aU.a(r2, (Object)"graph");
        ArrayList<String> arrayList = new ArrayList<String>();
        for (N n2 : r2.a()) {
            for (N n3 : r2.c(n2)) {
                arrayList.add(String.format(r2.b() ? "<%s -> %s>" : "[%s, %s]", n2, n3));
            }
        }
        return String.format("{%s}", aC.a(", ").a(arrayList));
    }

    private static <N, E> Map<N, Set<E>> e(L<N, E> l2) {
        aU.a(l2, (Object)"graph");
        return ii.a(l2.a(), new z(l2));
    }

    private static <N> Map<N, Set<N>> e(r<N> r2) {
        aU.a(r2, (Object)"graph");
        return ii.a(r2.a(), new A(r2));
    }

    private static aq<Object, String> f(L<?, ?> l2) {
        if (l2.b()) {
            return new B(l2);
        }
        return new C(l2);
    }

    private static String f(r<?> r2) {
        if (r2 instanceof L) {
            return x.g((L)r2);
        }
        return String.format("isDirected: %s, allowsSelfLoops: %s", r2.b(), r2.c());
    }

    private static String g(L<?, ?> l2) {
        return String.format("isDirected: %s, allowsParallelEdges: %s, allowsSelfLoops: %s", l2.b(), l2.e(), l2.c());
    }
}

