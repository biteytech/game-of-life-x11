// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class XColormapEvent {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("serial"),
        Constants$root.C_INT$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("display"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("window"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("colormap"),
        Constants$root.C_INT$LAYOUT.withName("new"),
        Constants$root.C_INT$LAYOUT.withName("state")
    );
    public static MemoryLayout $LAYOUT() {
        return XColormapEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XColormapEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XColormapEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XColormapEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XColormapEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XColormapEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XColormapEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XColormapEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XColormapEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XColormapEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XColormapEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XColormapEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XColormapEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XColormapEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XColormapEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XColormapEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("display"));
    public static VarHandle display$VH() {
        return XColormapEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XColormapEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XColormapEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XColormapEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XColormapEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XColormapEvent.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)XColormapEvent.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        XColormapEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XColormapEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XColormapEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle colormap$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("colormap"));
    public static VarHandle colormap$VH() {
        return XColormapEvent.colormap$VH;
    }
    public static long colormap$get(MemorySegment seg) {
        return (long)XColormapEvent.colormap$VH.get(seg);
    }
    public static void colormap$set( MemorySegment seg, long x) {
        XColormapEvent.colormap$VH.set(seg, x);
    }
    public static long colormap$get(MemorySegment seg, long index) {
        return (long)XColormapEvent.colormap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void colormap$set(MemorySegment seg, long index, long x) {
        XColormapEvent.colormap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle new_$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("new"));
    public static VarHandle new_$VH() {
        return XColormapEvent.new_$VH;
    }
    public static int new_$get(MemorySegment seg) {
        return (int)XColormapEvent.new_$VH.get(seg);
    }
    public static void new_$set( MemorySegment seg, int x) {
        XColormapEvent.new_$VH.set(seg, x);
    }
    public static int new_$get(MemorySegment seg, long index) {
        return (int)XColormapEvent.new_$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void new_$set(MemorySegment seg, long index, int x) {
        XColormapEvent.new_$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle state$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("state"));
    public static VarHandle state$VH() {
        return XColormapEvent.state$VH;
    }
    public static int state$get(MemorySegment seg) {
        return (int)XColormapEvent.state$VH.get(seg);
    }
    public static void state$set( MemorySegment seg, int x) {
        XColormapEvent.state$VH.set(seg, x);
    }
    public static int state$get(MemorySegment seg, long index) {
        return (int)XColormapEvent.state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, int x) {
        XColormapEvent.state$VH.set(seg.asSlice(index*sizeof()), x);
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

