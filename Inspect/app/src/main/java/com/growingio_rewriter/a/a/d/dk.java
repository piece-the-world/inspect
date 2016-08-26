/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dd;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

public abstract class dk<E>
extends dd<E>
implements SortedSet<E> {
    protected dk() {
    }

    protected abstract SortedSet<E> c();

    @Override
    public Comparator<? super E> comparator() {
        return this.c().comparator();
    }

    @Override
    public E first() {
        return this.c().first();
    }

    @Override
    public SortedSet<E> headSet(E e2) {
        return this.c().headSet(e2);
    }

    @Override
    public E last() {
        return this.c().last();
    }

    @Override
    public SortedSet<E> subSet(E e2, E e3) {
        return this.c().subSet(e2, e3);
    }

    @Override
    public SortedSet<E> tailSet(E e2) {
        return this.c().tailSet(e2);
    }

    private int b(Object object, Object object2) {
        Comparator<E> comparator = this.comparator();
        return comparator == null ? ((Comparable)object).compareTo(object2) : comparator.compare((Object)object, (Object)object2);
    }

    @Override
    protected boolean b(Object object) {
        try {
            dk dk2 = this;
            Object object2 = dk2.tailSet(object).first();
            return this.b(object2, object) == 0;
        }
        catch (ClassCastException var2_3) {
            return false;
        }
        catch (NoSuchElementException var2_4) {
            return false;
        }
        catch (NullPointerException var2_5) {
            return false;
        }
    }

    @Override
    protected boolean c(Object object) {
        try {
            Object object2;
            dk dk2 = this;
            Iterator<Object> iterator = dk2.tailSet(object).iterator();
            if (iterator.hasNext() && this.b(object2 = iterator.next(), object) == 0) {
                iterator.remove();
                return true;
            }
        }
        catch (ClassCastException var2_3) {
            return false;
        }
        catch (NullPointerException var2_4) {
            return false;
        }
        return false;
    }

    protected SortedSet<E> a(E e2, E e3) {
        return this.tailSet(e2).headSet(e3);
    }

    @Override
    protected /* synthetic */ Set a() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.c();
    }
}

