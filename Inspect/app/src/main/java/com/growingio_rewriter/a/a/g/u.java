/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

final class u {
    static final String a = "Node %s is not an element of this graph";
    static final String b = "Edge %s is not an element of this graph";
    static final String c = "Edge %s already exists between the following nodes: %s, so it can't be reused to connect node %s to %s";
    static final String d = "Nodes %s and %s are already connected by a different edge.";
    static final String e = "Can't add self-loop edge on node %s, as self-loops are not allowed.";
    static final String f = "Cannot call source()/target() on an undirected graph. Consider using incidentNodes() (if you don't know either incident node) or Graphs.oppositeNode() (if you know one of the incident nodes).";

    private u() {
    }
}

