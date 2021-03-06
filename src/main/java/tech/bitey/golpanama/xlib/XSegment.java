// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class XSegment {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("x1"),
        Constants$root.C_SHORT$LAYOUT.withName("y1"),
        Constants$root.C_SHORT$LAYOUT.withName("x2"),
        Constants$root.C_SHORT$LAYOUT.withName("y2")
    );
    public static MemoryLayout $LAYOUT() {
        return XSegment.$struct$LAYOUT;
    }
    static final VarHandle x1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x1"));
    public static VarHandle x1$VH() {
        return XSegment.x1$VH;
    }
    public static short x1$get(MemorySegment seg) {
        return (short)XSegment.x1$VH.get(seg);
    }
    public static void x1$set( MemorySegment seg, short x) {
        XSegment.x1$VH.set(seg, x);
    }
    public static short x1$get(MemorySegment seg, long index) {
        return (short)XSegment.x1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x1$set(MemorySegment seg, long index, short x) {
        XSegment.x1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y1"));
    public static VarHandle y1$VH() {
        return XSegment.y1$VH;
    }
    public static short y1$get(MemorySegment seg) {
        return (short)XSegment.y1$VH.get(seg);
    }
    public static void y1$set( MemorySegment seg, short x) {
        XSegment.y1$VH.set(seg, x);
    }
    public static short y1$get(MemorySegment seg, long index) {
        return (short)XSegment.y1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y1$set(MemorySegment seg, long index, short x) {
        XSegment.y1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x2"));
    public static VarHandle x2$VH() {
        return XSegment.x2$VH;
    }
    public static short x2$get(MemorySegment seg) {
        return (short)XSegment.x2$VH.get(seg);
    }
    public static void x2$set( MemorySegment seg, short x) {
        XSegment.x2$VH.set(seg, x);
    }
    public static short x2$get(MemorySegment seg, long index) {
        return (short)XSegment.x2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x2$set(MemorySegment seg, long index, short x) {
        XSegment.x2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y2"));
    public static VarHandle y2$VH() {
        return XSegment.y2$VH;
    }
    public static short y2$get(MemorySegment seg) {
        return (short)XSegment.y2$VH.get(seg);
    }
    public static void y2$set( MemorySegment seg, short x) {
        XSegment.y2$VH.set(seg, x);
    }
    public static short y2$get(MemorySegment seg, long index) {
        return (short)XSegment.y2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y2$set(MemorySegment seg, long index, short x) {
        XSegment.y2$VH.set(seg.asSlice(index*sizeof()), x);
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


