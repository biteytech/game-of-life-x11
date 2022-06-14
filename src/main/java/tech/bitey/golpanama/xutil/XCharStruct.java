// Generated by jextract

package tech.bitey.golpanama.xutil;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class XCharStruct {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("lbearing"),
        Constants$root.C_SHORT$LAYOUT.withName("rbearing"),
        Constants$root.C_SHORT$LAYOUT.withName("width"),
        Constants$root.C_SHORT$LAYOUT.withName("ascent"),
        Constants$root.C_SHORT$LAYOUT.withName("descent"),
        Constants$root.C_SHORT$LAYOUT.withName("attributes")
    );
    public static MemoryLayout $LAYOUT() {
        return XCharStruct.$struct$LAYOUT;
    }
    static final VarHandle lbearing$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lbearing"));
    public static VarHandle lbearing$VH() {
        return XCharStruct.lbearing$VH;
    }
    public static short lbearing$get(MemorySegment seg) {
        return (short)XCharStruct.lbearing$VH.get(seg);
    }
    public static void lbearing$set( MemorySegment seg, short x) {
        XCharStruct.lbearing$VH.set(seg, x);
    }
    public static short lbearing$get(MemorySegment seg, long index) {
        return (short)XCharStruct.lbearing$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lbearing$set(MemorySegment seg, long index, short x) {
        XCharStruct.lbearing$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rbearing$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rbearing"));
    public static VarHandle rbearing$VH() {
        return XCharStruct.rbearing$VH;
    }
    public static short rbearing$get(MemorySegment seg) {
        return (short)XCharStruct.rbearing$VH.get(seg);
    }
    public static void rbearing$set( MemorySegment seg, short x) {
        XCharStruct.rbearing$VH.set(seg, x);
    }
    public static short rbearing$get(MemorySegment seg, long index) {
        return (short)XCharStruct.rbearing$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rbearing$set(MemorySegment seg, long index, short x) {
        XCharStruct.rbearing$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("width"));
    public static VarHandle width$VH() {
        return XCharStruct.width$VH;
    }
    public static short width$get(MemorySegment seg) {
        return (short)XCharStruct.width$VH.get(seg);
    }
    public static void width$set( MemorySegment seg, short x) {
        XCharStruct.width$VH.set(seg, x);
    }
    public static short width$get(MemorySegment seg, long index) {
        return (short)XCharStruct.width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, short x) {
        XCharStruct.width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ascent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ascent"));
    public static VarHandle ascent$VH() {
        return XCharStruct.ascent$VH;
    }
    public static short ascent$get(MemorySegment seg) {
        return (short)XCharStruct.ascent$VH.get(seg);
    }
    public static void ascent$set( MemorySegment seg, short x) {
        XCharStruct.ascent$VH.set(seg, x);
    }
    public static short ascent$get(MemorySegment seg, long index) {
        return (short)XCharStruct.ascent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ascent$set(MemorySegment seg, long index, short x) {
        XCharStruct.ascent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle descent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("descent"));
    public static VarHandle descent$VH() {
        return XCharStruct.descent$VH;
    }
    public static short descent$get(MemorySegment seg) {
        return (short)XCharStruct.descent$VH.get(seg);
    }
    public static void descent$set( MemorySegment seg, short x) {
        XCharStruct.descent$VH.set(seg, x);
    }
    public static short descent$get(MemorySegment seg, long index) {
        return (short)XCharStruct.descent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void descent$set(MemorySegment seg, long index, short x) {
        XCharStruct.descent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle attributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("attributes"));
    public static VarHandle attributes$VH() {
        return XCharStruct.attributes$VH;
    }
    public static short attributes$get(MemorySegment seg) {
        return (short)XCharStruct.attributes$VH.get(seg);
    }
    public static void attributes$set( MemorySegment seg, short x) {
        XCharStruct.attributes$VH.set(seg, x);
    }
    public static short attributes$get(MemorySegment seg, long index) {
        return (short)XCharStruct.attributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void attributes$set(MemorySegment seg, long index, short x) {
        XCharStruct.attributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


