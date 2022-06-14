// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class XUnmapEvent {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("serial"),
        Constants$root.C_INT$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("display"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("event"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("window"),
        Constants$root.C_INT$LAYOUT.withName("from_configure"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return XUnmapEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XUnmapEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XUnmapEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XUnmapEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XUnmapEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XUnmapEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XUnmapEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XUnmapEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XUnmapEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XUnmapEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XUnmapEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XUnmapEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XUnmapEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XUnmapEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XUnmapEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XUnmapEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("display"));
    public static VarHandle display$VH() {
        return XUnmapEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XUnmapEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XUnmapEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XUnmapEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XUnmapEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("event"));
    public static VarHandle event$VH() {
        return XUnmapEvent.event$VH;
    }
    public static long event$get(MemorySegment seg) {
        return (long)XUnmapEvent.event$VH.get(seg);
    }
    public static void event$set( MemorySegment seg, long x) {
        XUnmapEvent.event$VH.set(seg, x);
    }
    public static long event$get(MemorySegment seg, long index) {
        return (long)XUnmapEvent.event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void event$set(MemorySegment seg, long index, long x) {
        XUnmapEvent.event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XUnmapEvent.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)XUnmapEvent.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        XUnmapEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XUnmapEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XUnmapEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle from_configure$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("from_configure"));
    public static VarHandle from_configure$VH() {
        return XUnmapEvent.from_configure$VH;
    }
    public static int from_configure$get(MemorySegment seg) {
        return (int)XUnmapEvent.from_configure$VH.get(seg);
    }
    public static void from_configure$set( MemorySegment seg, int x) {
        XUnmapEvent.from_configure$VH.set(seg, x);
    }
    public static int from_configure$get(MemorySegment seg, long index) {
        return (int)XUnmapEvent.from_configure$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void from_configure$set(MemorySegment seg, long index, int x) {
        XUnmapEvent.from_configure$VH.set(seg.asSlice(index*sizeof()), x);
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


