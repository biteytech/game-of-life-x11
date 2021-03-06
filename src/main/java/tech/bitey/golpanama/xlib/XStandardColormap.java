// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class XStandardColormap {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("colormap"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("red_max"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("red_mult"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("green_max"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("green_mult"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("blue_max"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("blue_mult"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("base_pixel"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("visualid"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("killid")
    );
    public static MemoryLayout $LAYOUT() {
        return XStandardColormap.$struct$LAYOUT;
    }
    static final VarHandle colormap$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("colormap"));
    public static VarHandle colormap$VH() {
        return XStandardColormap.colormap$VH;
    }
    public static long colormap$get(MemorySegment seg) {
        return (long)XStandardColormap.colormap$VH.get(seg);
    }
    public static void colormap$set( MemorySegment seg, long x) {
        XStandardColormap.colormap$VH.set(seg, x);
    }
    public static long colormap$get(MemorySegment seg, long index) {
        return (long)XStandardColormap.colormap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void colormap$set(MemorySegment seg, long index, long x) {
        XStandardColormap.colormap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle red_max$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("red_max"));
    public static VarHandle red_max$VH() {
        return XStandardColormap.red_max$VH;
    }
    public static long red_max$get(MemorySegment seg) {
        return (long)XStandardColormap.red_max$VH.get(seg);
    }
    public static void red_max$set( MemorySegment seg, long x) {
        XStandardColormap.red_max$VH.set(seg, x);
    }
    public static long red_max$get(MemorySegment seg, long index) {
        return (long)XStandardColormap.red_max$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void red_max$set(MemorySegment seg, long index, long x) {
        XStandardColormap.red_max$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle red_mult$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("red_mult"));
    public static VarHandle red_mult$VH() {
        return XStandardColormap.red_mult$VH;
    }
    public static long red_mult$get(MemorySegment seg) {
        return (long)XStandardColormap.red_mult$VH.get(seg);
    }
    public static void red_mult$set( MemorySegment seg, long x) {
        XStandardColormap.red_mult$VH.set(seg, x);
    }
    public static long red_mult$get(MemorySegment seg, long index) {
        return (long)XStandardColormap.red_mult$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void red_mult$set(MemorySegment seg, long index, long x) {
        XStandardColormap.red_mult$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle green_max$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("green_max"));
    public static VarHandle green_max$VH() {
        return XStandardColormap.green_max$VH;
    }
    public static long green_max$get(MemorySegment seg) {
        return (long)XStandardColormap.green_max$VH.get(seg);
    }
    public static void green_max$set( MemorySegment seg, long x) {
        XStandardColormap.green_max$VH.set(seg, x);
    }
    public static long green_max$get(MemorySegment seg, long index) {
        return (long)XStandardColormap.green_max$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void green_max$set(MemorySegment seg, long index, long x) {
        XStandardColormap.green_max$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle green_mult$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("green_mult"));
    public static VarHandle green_mult$VH() {
        return XStandardColormap.green_mult$VH;
    }
    public static long green_mult$get(MemorySegment seg) {
        return (long)XStandardColormap.green_mult$VH.get(seg);
    }
    public static void green_mult$set( MemorySegment seg, long x) {
        XStandardColormap.green_mult$VH.set(seg, x);
    }
    public static long green_mult$get(MemorySegment seg, long index) {
        return (long)XStandardColormap.green_mult$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void green_mult$set(MemorySegment seg, long index, long x) {
        XStandardColormap.green_mult$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle blue_max$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("blue_max"));
    public static VarHandle blue_max$VH() {
        return XStandardColormap.blue_max$VH;
    }
    public static long blue_max$get(MemorySegment seg) {
        return (long)XStandardColormap.blue_max$VH.get(seg);
    }
    public static void blue_max$set( MemorySegment seg, long x) {
        XStandardColormap.blue_max$VH.set(seg, x);
    }
    public static long blue_max$get(MemorySegment seg, long index) {
        return (long)XStandardColormap.blue_max$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void blue_max$set(MemorySegment seg, long index, long x) {
        XStandardColormap.blue_max$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle blue_mult$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("blue_mult"));
    public static VarHandle blue_mult$VH() {
        return XStandardColormap.blue_mult$VH;
    }
    public static long blue_mult$get(MemorySegment seg) {
        return (long)XStandardColormap.blue_mult$VH.get(seg);
    }
    public static void blue_mult$set( MemorySegment seg, long x) {
        XStandardColormap.blue_mult$VH.set(seg, x);
    }
    public static long blue_mult$get(MemorySegment seg, long index) {
        return (long)XStandardColormap.blue_mult$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void blue_mult$set(MemorySegment seg, long index, long x) {
        XStandardColormap.blue_mult$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle base_pixel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("base_pixel"));
    public static VarHandle base_pixel$VH() {
        return XStandardColormap.base_pixel$VH;
    }
    public static long base_pixel$get(MemorySegment seg) {
        return (long)XStandardColormap.base_pixel$VH.get(seg);
    }
    public static void base_pixel$set( MemorySegment seg, long x) {
        XStandardColormap.base_pixel$VH.set(seg, x);
    }
    public static long base_pixel$get(MemorySegment seg, long index) {
        return (long)XStandardColormap.base_pixel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void base_pixel$set(MemorySegment seg, long index, long x) {
        XStandardColormap.base_pixel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle visualid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("visualid"));
    public static VarHandle visualid$VH() {
        return XStandardColormap.visualid$VH;
    }
    public static long visualid$get(MemorySegment seg) {
        return (long)XStandardColormap.visualid$VH.get(seg);
    }
    public static void visualid$set( MemorySegment seg, long x) {
        XStandardColormap.visualid$VH.set(seg, x);
    }
    public static long visualid$get(MemorySegment seg, long index) {
        return (long)XStandardColormap.visualid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void visualid$set(MemorySegment seg, long index, long x) {
        XStandardColormap.visualid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle killid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("killid"));
    public static VarHandle killid$VH() {
        return XStandardColormap.killid$VH;
    }
    public static long killid$get(MemorySegment seg) {
        return (long)XStandardColormap.killid$VH.get(seg);
    }
    public static void killid$set( MemorySegment seg, long x) {
        XStandardColormap.killid$VH.set(seg, x);
    }
    public static long killid$get(MemorySegment seg, long index) {
        return (long)XStandardColormap.killid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void killid$set(MemorySegment seg, long index, long x) {
        XStandardColormap.killid$VH.set(seg.asSlice(index*sizeof()), x);
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


